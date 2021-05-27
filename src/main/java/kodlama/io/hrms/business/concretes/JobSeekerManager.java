package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.adapters.abstracts.EmailVerification;
import kodlama.io.hrms.core.adapters.abstracts.JobSeekerCheckService;
import kodlama.io.hrms.core.utilities.results.*;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlama.io.hrms.dataAccess.abstracts.UserDao;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private JobSeekerCheckService jobSeekerCheckService;
    private UserDao userDao;
    private EmailVerification emailVerification;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao, JobSeekerCheckService jobSeekerCheckService, UserDao userDao, EmailVerification emailVerification) {
        this.jobSeekerDao = jobSeekerDao;
        this.jobSeekerCheckService = jobSeekerCheckService;
        this.userDao = userDao;
        this.emailVerification = emailVerification;
    }



    @Override
    public Result add(JobSeeker jobSeeker) {
        Result result = isJobSeekerAppropriate(jobSeeker);
        if(!result.isSuccess()){
            return new FailResult(result.getMessage());
        }
        try {
            Result checkedResult = jobSeekerCheckService.checkIfRealPerson(jobSeeker);
            if(!checkedResult.isSuccess()){
                return new FailResult(result.getMessage());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Result verify = emailVerification.Verify(jobSeeker);
        if (!verify.isSuccess()){
            return new FailResult(verify.getMessage());
        }
        jobSeekerDao.save(jobSeeker);
        return new SuccessResult(Messages.UserAdded);

    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(Messages.DataListed,jobSeekerDao.findAll());
    }

    private Result isJobSeekerAppropriate(JobSeeker jobSeeker){

        if(jobSeeker.getUser().getEmail() == null){
            return new FailResult(Messages.MailCanNotBeNull);
        }
        else if(jobSeeker.getUser().getPassword() == null){
            return new FailResult(Messages.PasswordCanNotBeNull);
        }
        else if(jobSeeker.getFirstName() == null || jobSeeker.getLastName() == null){
            return new FailResult(Messages.NameCanNotBeNull);
        }
        else if(String.valueOf(jobSeeker.getNationality_id()).length() != 11){
            return new FailResult(Messages.NationalityIdIncorrect);
        }
        else if(jobSeeker.getYear_of_birth() <= 1900 && jobSeeker.getYear_of_birth() > LocalDate.now().getYear()){
            return new FailResult(Messages.BirthYearIncorrect);
        }
        else if(userDao.findByEmail(jobSeeker.getUser().getEmail()) != null){
            return new FailResult(Messages.EmailUsing);
        }
        else if(jobSeekerDao.findAllByNationality_id(jobSeeker.getNationality_id()) != null){
            return new FailResult(Messages.NationalityIdUsing);
        }
        return new SuccessResult(Messages.JobSeekerAppropriate);

    }
}
