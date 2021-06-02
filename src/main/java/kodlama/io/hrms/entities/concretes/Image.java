package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "images")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "id")
    private JobSeeker jobSeeker;

    @Column(name = "image_title")
    private String imageTitle;

    @Column(name = "image")
    private String imagePath;
}
