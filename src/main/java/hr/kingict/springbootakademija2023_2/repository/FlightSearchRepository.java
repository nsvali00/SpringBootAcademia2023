package hr.kingict.springbootakademija2023_2.repository;

import hr.kingict.springbootakademija2023_2.entity.FlightSearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FlightSearchRepository extends JpaRepository<FlightSearchEntity,Long> {

    @Query(value="select fs from FlightSearchEntity fs where fs.originLocationCode = :originLocationCode and " +
            "fs.destinationLocationCode = :destinationLocationCode and " +
            "fs.departureDate = :departureDate and " +
            "fs.returnDate = :returnDate and " +
            "fs.adults = :adults")
    List<FlightSearchEntity> findByFlightSearch(String originLocationCode, String destinationLocationCode, LocalDate departureDate,
                                                 LocalDate returnDate, Integer adults);

    FlightSearchEntity findByOriginLocationCode(String originLocationCode);

}
