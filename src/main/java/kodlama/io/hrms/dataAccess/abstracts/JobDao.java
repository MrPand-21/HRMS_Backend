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

    @Query("select new kodlama.io.hrms.entities.dtos.JobForGetAllDto" +
            "(j.id , p.position_name , e.companyName , j.empty_positions, c.cityName ,j.createdDate, j.deadline, j.isActive , apf.isApproved )" +
            " from ActivationPanelForSystemUser apf " +
            " inner join apf.job j" +
            " inner join j.employer e" +
            " inner join j.jobPosition p" +
            " inner join j.city c ")
    List<JobForGetAllDto> getAllJobDtos();

    @Query("select new kodlama.io.hrms.entities.dtos.JobForGetAllDto(j.id , p.position_name , e.companyName , j.empty_positions, c.cityName ,j.createdDate, j.deadline, j.isActive ,a.isApproved ) from Job j inner join j.employer e inner join j.jobPosition p inner join j.city c inner join ActivationPanelForSystemUser a on j.id = a.job.id where j.isActive = true and j.id = a.job.id and j.deadline > current_date order by j.createdDate")
    List<JobForGetAllDto> getAllJobsByDate();


    List<Job> getAllByIsActiveTrueAndEmployer_Id(int id);

    @Modifying
    @Query("UPDATE Job SET isActive = false WHERE id =:id")
    void setInactiveToJob(@Param("id") int id);

    @Modifying
    @Query("UPDATE Job SET isActive = true WHERE id =:id")
    void setActiveToJob(@Param("id") int id);

}
