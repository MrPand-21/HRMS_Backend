package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.ActivationPanelForSystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivationPanelDao extends JpaRepository<ActivationPanelForSystemUser,Integer> {

    ActivationPanelForSystemUser getActivationPanelForSystemUserByJobId_Id(int id);
}
