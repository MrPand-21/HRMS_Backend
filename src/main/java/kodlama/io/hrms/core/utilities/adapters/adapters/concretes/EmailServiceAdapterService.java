package kodlama.io.hrms.core.utilities.adapters.adapters.concretes;

import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.adapters.adapters.abstracts.EmailVerificationService;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.entities.abstracts.User;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceAdapterService implements EmailVerificationService {

    @Override
    public Result Verify(User user) {
        return new SuccessResult(Messages.Verified);
    }
}
