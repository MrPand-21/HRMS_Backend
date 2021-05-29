package kodlama.io.hrms.core.utilities.adapters.adapters.abstracts;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.abstracts.User;

public interface EmailVerification {
    Result Verify(User user);
}
