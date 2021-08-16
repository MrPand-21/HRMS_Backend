package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.*;
import kodlama.io.hrms.entities.concretes.ActivationPanelForSystemUser;
import kodlama.io.hrms.entities.concretes.Job;
import kodlama.io.hrms.entities.concretes.JobPosition;
import kodlama.io.hrms.entities.dtos.JobForAddDto;
import kodlama.io.hrms.entities.dtos.JobForGetAllDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDao jobDao;
    private ActivationPanelDao activationPanelDao;
    private CityDao cityDao;
    private WorkPlaceDao workPlaceDao;
    private WorkTimeDao workTimeDao;
    private EmployerDao employerDao;
    private JobPositionDao jobPositionDao;

    @Autowired
    public JobManager(JobDao jobDao, ActivationPanelDao activationPanelDao,
                      CityDao cityDao, WorkPlaceDao workPlaceDao, WorkTimeDao workTimeDao,
                      EmployerDao employerDao, JobPositionDao jobPositionDao) {
        this.jobDao = jobDao;
        this.activationPanelDao = activationPanelDao;
        this.cityDao = cityDao;
        this.workPlaceDao = workPlaceDao;
        this.workTimeDao = workTimeDao;
        this.employerDao = employerDao;
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public DataResult<List<JobForGetAllDto>> getAll() {
        return new SuccessDataResult<List<JobForGetAllDto>>(

                Messages.DataListed, jobDao.getAllJobDtos());

    }

    @Override
    public DataResult<List<JobForGetAllDto>> getAllApprovedJobs() {

        return new SuccessDataResult<List<JobForGetAllDto>>(Messages.DataListed,
                jobDao.getAllApprovedJobDtos());
    }

    @Override
    public DataResult<List<JobForGetAllDto>> getAllUnapprovedJobs() {
        return new SuccessDataResult<List<JobForGetAllDto>>(Messages.DataListed,
                jobDao.getAllUnapprovedJobDtos());
    }

    @Override
    public DataResult<List<JobForGetAllDto>> getAllByDate() {
        return new SuccessDataResult<List<JobForGetAllDto>>(Messages.DataListed,
                jobDao.getAllJobsByDate());
    }

    @Override
    public DataResult<Job> getJobById(int id) {
        return new SuccessDataResult<Job>(Messages.DataListed, jobDao.getJobById(id));
    }

    @Override
    public DataResult<JobForGetAllDto> getJobForGetAllDtoById(int id) {
        return new SuccessDataResult<JobForGetAllDto>(Messages.DataListed, jobDao.getJobForGetAllDtoById(id));
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
    public Result add(JobForAddDto jobForAddDto) {
        Job job = new Job();
        job.setActive(true);
        job.setMinimumSalary(jobForAddDto.getMinimumSalary());
        job.setMaximumSalary(jobForAddDto.getMaximumSalary());
        job.setCreatedDate(jobForAddDto.getCreatedDate());
        job.setDeadline(jobForAddDto.getDeadline());
        job.setEmpty_positions(jobForAddDto.getNumberOfEmptyPositions());
        job.setDescription(jobForAddDto.getDescription());

        job.setCity(this.cityDao.getCityById( jobForAddDto.getCityId()));
        job.setEmployer(this.employerDao.getEmployerById(jobForAddDto.getEmployerId()));
        job.setWorkPlace(this.workPlaceDao.getById(jobForAddDto.getWorkPlaceId()));
        job.setWorkTime(this.workTimeDao.getById(jobForAddDto.getWorkTimeId()));
        job.setJobPosition(this.jobPositionDao.getJobPositionById(jobForAddDto.getJobPositionId()));

        ActivationPanelForSystemUser activationPanelForSystemUser = new
                ActivationPanelForSystemUser(null,job,new Date(),false,null);
        activationPanelDao.save(activationPanelForSystemUser);
        jobDao.save(job);
        return new SuccessResult(Messages.JobAdded);
    }

    @Override
    public Result delete(int id) {
        activationPanelDao.delete(activationPanelDao.getActivationPanelForSystemUserByJobId_Id(id));
        jobDao.delete(jobDao.getJobById(id));
        return new SuccessResult(Messages.JobDeleted);
    }
}
