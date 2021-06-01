package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Job;
import kodlama.io.hrms.entities.dtos.JobForGetAllDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobDao extends JpaRepository<Job, Integer> {

    @Query("select new kodlama.io.hrms.entities.dtos.JobForGetAllDto(j.id , e.companyName , j.empty_positions, c.cityName ,j.createdDate, j.deadline) from Job j Inner Join j.employer e Inner Join j.jobPosition p INNER JOIN j.city c where j.isActive = true ")
    List<JobForGetAllDto> getAllJobs();

    @Query("select new kodlama.io.hrms.entities.dtos.JobForGetAllDto(j.id , e.companyName , j.empty_positions, c.cityName ,j.createdDate, j.deadline) from Job j Inner Join j.employer e Inner Join j.jobPosition p INNER JOIN j.city c where j.isActive = true and j.deadline > current_date order by j.createdDate")
    List<JobForGetAllDto> getAllJobsByDate();


    List<Job> getAllByIsActiveTrueAndEmployer_Id(int id);

    @Modifying
    @Query("UPDATE Job SET isActive = false WHERE id =:id")
    void setInactiveToJob(@Param("id") int id);

    @Modifying
    @Query("UPDATE Job SET isActive = true WHERE id =:id")
    void setActiveToJob(@Param("id") int id);

}
