package kodlama.io.hrms.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Data
@Table(name = "job_seekers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "national_id")
    private long nationality_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "year_of_birth")
    private int year_of_birth;

}
