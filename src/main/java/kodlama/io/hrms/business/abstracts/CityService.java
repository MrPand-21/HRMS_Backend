package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.City;

import java.util.List;

public interface CityService {

    Result add(City city);
    Result update(City city);
    Result delete(City city);
    DataResult<List<City>> getAll();

}
