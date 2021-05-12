package kodlama.io.hrms.dataAccess.abstracts;


import kodlama.io.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
}
