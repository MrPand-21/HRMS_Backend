package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlama.io.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Table(name = "employers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employer{

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "web_sites")
    private String webSites;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "userId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

}
