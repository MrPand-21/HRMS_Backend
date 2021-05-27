package kodlama.io.hrms.core.adapters.concretes;

import kodlama.io.hrms.core.adapters.abstracts.JobSeekerCheckService;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class MernisServiceAdapter implements JobSeekerCheckService {

    @Override
    public boolean checkIfRealPerson(JobSeeker jobSeeker) throws MalformedURLException {
        String endPoint = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx" ;
        URL url = URI.create(endPoint).toURL();
        KPSPublic service = new KPSPublic(url);
        KPSPublicSoap port = service.getPort(KPSPublicSoap.class);
        return port.tcKimlikNoDogrula(jobSeeker.getNationality_id(),jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getYear_of_birth());
    }

}
