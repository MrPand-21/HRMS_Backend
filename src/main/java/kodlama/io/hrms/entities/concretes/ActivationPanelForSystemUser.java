package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "activation_panel_for_system_user")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ActivationPanelForSystemUser {

    public ActivationPanelForSystemUser(SystemUser systemUser, Job job, Date activationDate, boolean isApproved, String detail) {
        this.systemUser = systemUser;
        this.job = job;
        this.activationDate = activationDate;
        this.isApproved = isApproved;
        this.detail = detail;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = SystemUser.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "system_user")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private SystemUser systemUser;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    @Column(name = "activation_date")
    private Date activationDate;

    @Column(name = "is_approved")
    private boolean isApproved;

    @Column(name = "detail")
    private String detail;

}
