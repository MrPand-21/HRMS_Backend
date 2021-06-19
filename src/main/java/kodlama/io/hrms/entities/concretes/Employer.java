package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import kodlama.io.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Table(name = "employers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobs"})
public class Employer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "companyname")
    private String companyName;

    @NotNull
    @Column(name = "phonenumber")
    private String phone;

    @NotNull
    @Column(name = "website")
    private String webSites;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

    @OneToMany(mappedBy = "employer")
    @JsonIgnore
    private List<Job> jobs;

}
