package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Job;
import kodlama.io.hrms.entities.dtos.JobForGetAllDto;

import java.util.List;

public interface JobService {

    DataResult<List<JobForGetAllDto>> getAll();

    DataResult<List<JobForGetAllDto>> getAllByDate();

    DataResult<List<Job>> getAllJobOfEmployer(int employerId);

    Result setInactiveToJobVisibility(int id);

    Result setActiveToJobVisibility(int id);

    Result add(Job job);

}
