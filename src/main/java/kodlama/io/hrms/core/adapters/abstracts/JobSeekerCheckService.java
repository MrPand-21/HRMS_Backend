package kodlama.io.hrms.core.adapters.abstracts;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;

import java.net.MalformedURLException;

public interface JobSeekerCheckService {
    Result checkIfRealPerson(JobSeeker jobSeeker) throws MalformedURLException;


}
