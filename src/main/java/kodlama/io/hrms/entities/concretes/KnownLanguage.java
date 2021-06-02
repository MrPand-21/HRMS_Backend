package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "known_languages")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class KnownLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "id")
    private JobSeeker jobSeeker;

    @ManyToOne()
    @JoinColumn(name = "language_level_id")
    private LanguageLevel languageLevel;

    @Column(name = "language_name")
    private String languageName;

}
