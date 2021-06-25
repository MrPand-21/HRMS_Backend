package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlama.io.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "system_users")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SystemUser{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "role")
    private String role;


    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

    @OneToMany(mappedBy = "systemUser")
    @JsonIgnore
    private List<ActivationPanelForSystemUser> activationPanelForSystemUsers;

}
