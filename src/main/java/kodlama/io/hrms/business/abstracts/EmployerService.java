package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    Result add(Employer employer);
    DataResult<List<Employer>> getAll();
    DataResult<Employer> getById(int id);

}
