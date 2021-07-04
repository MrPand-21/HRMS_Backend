package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.CityService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CityDao;
import kodlama.io.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public Result add(City city) {
        cityDao.save(city);
        return new SuccessResult( Messages.CityAdded);
    }

    @Override
    public Result update(City city) {
        cityDao.save(city);
        return new SuccessResult( Messages.CityUpdated);
    }

    @Override
    public Result delete(City city) {
        cityDao.delete(city);
        return new SuccessResult( Messages.CityDeleted);
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(Messages.DataListed, cityDao.findAll());
    }
}
