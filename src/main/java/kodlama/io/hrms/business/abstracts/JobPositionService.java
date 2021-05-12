package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.JobPosition;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
}
