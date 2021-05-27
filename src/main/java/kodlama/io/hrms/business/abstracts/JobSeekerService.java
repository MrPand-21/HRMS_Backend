package kodlama.io.hrms.business.abstracts;


import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {

    Result add(JobSeeker jobSeeker);

    DataResult<List<JobSeeker>> getAll();

}
