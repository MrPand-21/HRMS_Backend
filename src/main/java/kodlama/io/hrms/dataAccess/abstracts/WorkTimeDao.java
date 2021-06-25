package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.WorkTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkTimeDao extends JpaRepository<WorkTime,Integer> {

    WorkTime getById(int id);
}
