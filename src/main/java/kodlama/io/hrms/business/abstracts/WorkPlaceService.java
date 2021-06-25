package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.WorkPlace;

import java.util.List;

public interface WorkPlaceService {

    DataResult<List<WorkPlace>> getAll();
    DataResult<WorkPlace> getById(int id);

}
