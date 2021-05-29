package kodlama.io.hrms.core.utilities.adapters.adapters.abstracts;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;

public interface JobSeekerCheckService {
    Result checkIfRealPerson(JobSeeker jobSeeker) throws Exception;


}
