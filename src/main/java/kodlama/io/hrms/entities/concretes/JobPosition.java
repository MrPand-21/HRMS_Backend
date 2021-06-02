package kodlama.io.hrms.entities.concretes;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "job_positions")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "Job"})
public class JobPosition {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="position_name")
    private String position_name;

    @OneToMany(mappedBy = "jobPosition")
    private List<Job> jobs;

    @OneToMany(mappedBy = "jobPosition")
    private List<WorkExperience> workExperiences;

    @OneToMany(mappedBy = "jobPosition")
    private List<JobSeeker> jobSeekers;

}
