package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlama.io.hrms.entities.abstracts.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "job_seekers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "userid" , referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "birthdate")
    private int birthDate;

    @Column(name = "nationalityid")
    private long nationalityId;

}
