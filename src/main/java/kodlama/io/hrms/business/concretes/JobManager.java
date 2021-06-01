package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobDao;
import kodlama.io.hrms.entities.concretes.Job;
import kodlama.io.hrms.entities.dtos.JobForGetAllDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDao jobDao;

    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public DataResult<List<JobForGetAllDto>> getAll() {
        return new SuccessDataResult<List<JobForGetAllDto>>(Messages.DataListed, jobDao.getAllJobs());
    }

    @Override
    public DataResult<List<JobForGetAllDto>> getAllByDate() {
        return new SuccessDataResult<List<JobForGetAllDto>>(Messages.DataListed, jobDao.getAllJobsByDate());
    }

    @Override
    public DataResult<List<Job>> getAllJobOfEmployer(int employerId) {
        return new SuccessDataResult<List<Job>>(Messages.DataListed, jobDao.getAllByIsActiveTrueAndEmployer_Id(employerId));
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
        jobDao.save(job);
        return new SuccessResult(Messages.JobAdded);
    }
}
