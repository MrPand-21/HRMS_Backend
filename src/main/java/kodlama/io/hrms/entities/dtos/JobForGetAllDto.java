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

    private String positionName;

    private int number_of_empty_positions;

    private String cityName;

    private Date createdDate;

    private Date deadLine;
}
