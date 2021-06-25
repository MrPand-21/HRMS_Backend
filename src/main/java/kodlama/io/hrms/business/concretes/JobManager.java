package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.ActivationPanelDao;
import kodlama.io.hrms.dataAccess.abstracts.JobDao;
import kodlama.io.hrms.entities.concretes.ActivationPanelForSystemUser;
import kodlama.io.hrms.entities.concretes.Job;
import kodlama.io.hrms.entities.dtos.JobForGetAllDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDao jobDao;
    private ActivationPanelDao activationPanelDao;

    @Autowired
    public JobManager(JobDao jobDao,ActivationPanelDao activationPanelDao) {
        this.jobDao = jobDao;
        this.activationPanelDao = activationPanelDao;
    }

    @Override
    public DataResult<List<JobForGetAllDto>> getAll() {
        return new SuccessDataResult<List<JobForGetAllDto>>(

                Messages.DataListed, jobDao.getAllJobDtos());

    }

    @Override
    public DataResult<List<JobForGetAllDto>> getAllByDate() {
        return new SuccessDataResult<List<JobForGetAllDto>>(Messages.DataListed,
                jobDao.getAllJobsByDate());
    }

    @Override
    public DataResult<List<Job>> getAllJobOfEmployer(int employerId) {
        return new SuccessDataResult<List<Job>>(Messages.DataListed,
                jobDao.getAllByIsActiveTrueAndEmployer_Id(employerId));
    }

    @Override
    public Result setInactiveToJobVisibility(int id) {
        jobDao.setInactiveToJob(id);
        return new SuccessResult(Messages.JobIsInvisible);
    }

    @Override
    public Result setActiveToJobVisibility(int id) {
        jobDao.setActiveToJob(id);
        return new SuccessResult(Messages.JobIsVisible);
    }

    @Override
    public Result add(Job job) {
        ActivationPanelForSystemUser activationPanelForSystemUser = new
                ActivationPanelForSystemUser(null,job,new Date(),false,null);
        activationPanelDao.save(activationPanelForSystemUser);
        jobDao.save(job);
        return new SuccessResult(Messages.JobAdded);
    }
}
