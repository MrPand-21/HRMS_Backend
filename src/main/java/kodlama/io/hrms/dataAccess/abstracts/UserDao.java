package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.abstracts.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    List<User> findByEmail(String email);
}
