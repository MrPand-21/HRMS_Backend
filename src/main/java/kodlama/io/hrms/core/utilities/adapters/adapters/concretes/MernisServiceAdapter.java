package kodlama.io.hrms.core.utilities.adapters.adapters.concretes;

import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.adapters.adapters.abstracts.JobSeekerCheckService;
import kodlama.io.hrms.core.utilities.results.FailResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import mernisService.ECHKPSPublicSoap;
import org.springframework.stereotype.Service;

@Service
public class MernisServiceAdapter implements JobSeekerCheckService {

    @Override
    public Result checkIfRealPerson(JobSeeker jobSeeker) throws Exception {

        ECHKPSPublicSoap echkpsPublicSoap = new ECHKPSPublicSoap();
        boolean result = echkpsPublicSoap.TCKimlikNoDogrula(jobSeeker.getNationalityId(),
                jobSeeker.getFirstName(),
                jobSeeker.getLastName(),
                jobSeeker.getBirthDate());
        if (!result){
            return new FailResult(Messages.NotValidUser);
        }
        return new SuccessResult(Messages.ValidUser);
    }

}
