package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.WorkPlaceService;
import kodlama.io.hrms.business.abstracts.WorkTimeService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.WorkPlaceDao;
import kodlama.io.hrms.dataAccess.abstracts.WorkTimeDao;
import kodlama.io.hrms.entities.concretes.WorkPlace;
import kodlama.io.hrms.entities.concretes.WorkTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkTimeManager implements WorkTimeService {

    private WorkTimeDao workTimeDao;

    @Autowired
    public WorkTimeManager(WorkTimeDao workTimeDao) {
        this.workTimeDao = workTimeDao;
    }

    @Override
    public DataResult<List<WorkTime>> getAll() {
        return new SuccessDataResult<List<WorkTime>>(Messages.DataListed, workTimeDao.findAll());
    }

    @Override
    public DataResult<WorkTime> getById(int id) {
        return new SuccessDataResult<WorkTime>(Messages.WorkTimeFound, workTimeDao.getById(id));
    }
}
