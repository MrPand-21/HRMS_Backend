package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "work_experiences")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    private JobPosition jobPosition;

    @ManyToOne()
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "id")
    private JobSeeker jobSeeker;

    @Column(name = "workplace_name")
    private String workplaceName;

    @Column(name = "starting_date")
    private Date startingDate;

    @Column(name = "quit_date")
    private Date quitDate;

}
