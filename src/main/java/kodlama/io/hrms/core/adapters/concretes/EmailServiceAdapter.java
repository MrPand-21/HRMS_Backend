package kodlama.io.hrms.core.adapters.concretes;

import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.adapters.abstracts.EmailVerification;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceAdapter implements EmailVerification {

    @Override
    public Result Verify(JobSeeker jobSeeker) {
        return new SuccessResult(Messages.Verified);
    }
}
