package kodlama.io.hrms.entities.concretes;



import javax.persistence.*;



@Entity
@Table(name = "job_positions")
public class JobPosition {


    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="position_name")
    private String position_name;

    public JobPosition() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }
}
