package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.WorkPlaceService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.WorkPlaceDao;
import kodlama.io.hrms.entities.concretes.WorkPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkPlaceManager implements WorkPlaceService {

    private WorkPlaceDao workPlaceDao;

    @Autowired
    public WorkPlaceManager(WorkPlaceDao workPlaceDao) {
        this.workPlaceDao = workPlaceDao;
    }

    @Override
    public DataResult<List<WorkPlace>> getAll() {
        return new SuccessDataResult<List<WorkPlace>>(Messages.DataListed, workPlaceDao.findAll());
    }

    @Override
    public DataResult<WorkPlace> getById(int id) {
        return new SuccessDataResult<WorkPlace>(Messages.WorkPlaceFound, workPlaceDao.getById(id));
    }
}
