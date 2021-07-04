package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends JpaRepository<City, Integer> {

    City getCityById(int id);

}
