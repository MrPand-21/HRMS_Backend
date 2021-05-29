package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.adapters.adapters.abstracts.EmailVerificationService;
import kodlama.io.hrms.core.utilities.adapters.adapters.abstracts.JobSeekerCheckService;
import kodlama.io.hrms.core.utilities.results.*;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlama.io.hrms.dataAccess.abstracts.UserDao;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private JobSeekerCheckService jobSeekerCheckService;
    private UserDao userDao;
    private EmailVerificationService emailVerification;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao, JobSeekerCheckService jobSeekerCheckService, UserDao userDao, EmailVerificationService emailVerification) {
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

        Result checkedResult = null;

        try {
            checkedResult = jobSeekerCheckService.checkIfRealPerson(jobSeeker);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(!checkedResult.isSuccess()){
            return new FailResult(checkedResult.getMessage());
        }

        Result verify = emailVerification.Verify(jobSeeker.getUser());
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
        if(jobSeeker.getUser().getPassword() == null){
            return new FailResult(Messages.PasswordCanNotBeNull);
        }
        if(jobSeeker.getFirstName() == null || jobSeeker.getLastName() == null){
            return new FailResult(Messages.NameCanNotBeNull);
        }
        if(String.valueOf(jobSeeker.getNationalityId()).length() != 11){
            return new FailResult(Messages.NationalityIdIncorrect);
        }
        if(jobSeeker.getBirthDate() <= 1900 || jobSeeker.getBirthDate() > LocalDate.now().getYear()){
            return new FailResult(Messages.BirthYearIncorrect);
        }
        if(userDao.findByEmail(jobSeeker.getUser().getEmail()).stream().count() != 0){
            return new FailResult(Messages.EmailUsing);
        }
        if(jobSeekerDao.findByNationalityId(jobSeeker.getNationalityId()).stream().count() != 0){
            return new FailResult(Messages.NationalityIdUsing);
        }

        return new SuccessResult(Messages.JobSeekerAppropriate);

    }
}
