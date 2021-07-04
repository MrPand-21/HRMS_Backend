package kodlama.io.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobForGetAllDto {

    private int id;

    private int minimumSalary;

    private int maximumSalary;

    private int number_of_empty_positions;

    private String positionName;

    private String companyName;

    private String cityName;

    private Date createdDate;

    private Date deadLine;

    private String workPlaceName;

    private String workTimeName;

    private String description;

    private boolean isActive;

    private boolean isApproved;
    
}
