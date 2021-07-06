package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

    List<JobSeeker> findByNationalityId(long nationalityId);

    JobSeeker findById(int id);

    @Query("from JobSeeker j inner join j.workExperiences w order by w.startingDate desc ")
    List<JobSeeker> findByOrderByWorkExperiences_StartingDateDesc();
}
