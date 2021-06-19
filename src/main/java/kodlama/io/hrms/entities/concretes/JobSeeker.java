package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlama.io.hrms.entities.abstracts.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @Column(name = "linkedin_account")
    private String linkedInAccount;

    @Column(name = "github_account")
    private String githubAccount;

    @Column(name = "info_about_job_seeker")
    private String info;

    @OneToMany(targetEntity = KnownLanguage.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "jobSeeker")
    private List<KnownLanguage> languages;

    @OneToMany(mappedBy = "jobSeeker",targetEntity = AttendedSchool.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttendedSchool> attendedSchools;

    @OneToMany(mappedBy = "jobSeeker",targetEntity = AttendedSchool.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Image> images;

    @OneToMany(mappedBy = "jobSeeker",targetEntity = AttendedSchool.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<WorkExperience> workExperiences;


}
