package kodlama.io.hrms.core.adapters.abstracts;

import kodlama.io.hrms.entities.concretes.JobSeeker;

import java.net.MalformedURLException;

public interface JobSeekerCheckService {
    boolean checkIfRealPerson(JobSeeker jobSeeker) throws MalformedURLException;
}
