package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "attended_schools")
public class AttendedSchool {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToOne()
    @JoinColumn(name = "job_seeker_id")
    @JsonIgnore
    private JobSeeker jobSeeker;

    @Column(name = "startingDateOfUniversity")
    private Date dateOfStarting;

    @Column(name = "graduationDateOfUniversity")
    private Date dateOfGraduation;
}
