package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlama.io.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "activation_panel_for_system_user")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class activationPanelForSystemUser {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employerid")
    private int employerId;

    @Column(name = "systemUserId")
    private int systemUserId;

    @Column(name = "activationdate")
    private int activationDate;

    @Column(name = "isactivated")
    private boolean isactivated;

    @Column(name = "detail")
    private String detail;

}
