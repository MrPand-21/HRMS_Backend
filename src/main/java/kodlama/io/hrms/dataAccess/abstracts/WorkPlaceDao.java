package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.WorkPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkPlaceDao extends JpaRepository<WorkPlace,Integer> {

    WorkPlace getById(int id);
}
