package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.adapters.adapters.abstracts.EmailVerificationService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.dataAccess.abstracts.UserDao;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.hrms.core.utilities.results.*;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    private EmailVerificationService emailVerification;
    private UserDao userDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao, EmailVerificationService emailVerification, UserDao userDao) {
        this.employerDao = employerDao;
        this.emailVerification = emailVerification;
        this.userDao = userDao;
    }

    @Override
    public Result add(Employer employer) {

        Result result = emailVerification.Verify(employer.getUser());
        if (!result.isSuccess()){
            return new FailResult(result.getMessage());
        }
        employer.getUser().setActivated(false);

        if(userDao.findByEmail(employer.getUser().getEmail()).stream().count() != 0){
            return new FailResult(Messages.EmailUsing);
        }

        employerDao.save(employer);

        return new SuccessResult(Messages.EmployerAdded);
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(Messages.DataListed, employerDao.findAll());
    }
}
