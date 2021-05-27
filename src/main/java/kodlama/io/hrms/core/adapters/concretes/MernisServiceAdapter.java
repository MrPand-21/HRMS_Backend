package kodlama.io.hrms.core.adapters.concretes;

import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.adapters.abstracts.JobSeekerCheckService;
import kodlama.io.hrms.core.utilities.results.FailResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

@Service
public class MernisServiceAdapter implements JobSeekerCheckService {

    @Override
    public Result checkIfRealPerson(JobSeeker jobSeeker) throws MalformedURLException {
        String endPoint = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx" ;
        URL url = URI.create(endPoint).toURL();
        KPSPublic service = new KPSPublic(url);
        KPSPublicSoap port = service.getPort(KPSPublicSoap.class);
        boolean result = port.tcKimlikNoDogrula(jobSeeker.getNationality_id()
                ,jobSeeker.getFirstName(), jobSeeker.getLastName()
                , jobSeeker.getYear_of_birth());
        if (!result){
            return new FailResult(Messages.NotValidUser);
        }
        return new SuccessResult(Messages.ValidUser);
    }

}
