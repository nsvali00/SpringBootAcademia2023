package hr.kingict.springbootakademija2023_2.repository;

import hr.kingict.springbootakademija2023_2.entity.FlightSearchResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightSearchResultRepository  extends JpaRepository<FlightSearchResultEntity,Long> {
}
