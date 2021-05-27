package kodlama.io.hrms.core.adapters.abstracts;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;

public interface EmailVerification {
    Result Verify(JobSeeker jobSeeker);
}
