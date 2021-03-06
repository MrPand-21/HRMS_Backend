package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployerDao extends JpaRepository<Employer,Integer> {

    Employer getEmployerById(int id);

}
