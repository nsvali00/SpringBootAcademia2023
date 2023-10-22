package hr.kingict.springbootakademija2023_2.service;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.referencedata.Locations;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.Location;
import hr.kingict.springbootakademija2023_2.entity.FlightSearchEntity;
import hr.kingict.springbootakademija2023_2.repository.FlightSearchRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class FlightService {
    Logger logger = LoggerFactory.getLogger(FlightService.class);

    @Autowired
    private Amadeus amadeus;

    @Autowired
    private FlightSearchRepository flightSearchRepository;
    public List<Location> getAirports(String keyword){

        Params params = Params
                .with("subType", Locations.AIRPORT)
                .and("keyword", keyword);

        try {
            List<Location> list = Arrays.asList(amadeus.referenceData.locations.get(params));
            return list;
        } catch (ResponseException e) {
            logger.error("getAirports error" + e);
            return Collections.emptyList();
        }
    }

    public List<FlightOfferSearch> getFlights(String originLocationCode, String destinationLocationCode, LocalDate departureDate,
                             LocalDate returnDate, Integer adults){

        List<FlightSearchEntity> byFlightSearch = flightSearchRepository.findByFlightSearch(originLocationCode,
                destinationLocationCode, departureDate, returnDate, adults);



        if(CollectionUtils.isEmpty(byFlightSearch)) {
            FlightSearchEntity flightSearchEntity = new FlightSearchEntity();
            flightSearchEntity.setOriginLocationCode(originLocationCode);
            flightSearchEntity.setDestinationLocationCode(destinationLocationCode);
            flightSearchEntity.setDepartureDate(departureDate);
            flightSearchEntity.setReturnDate(returnDate);
            flightSearchEntity.setAdults(adults);

            flightSearchEntity.setUserCreated("ja sam kreirao");
            flightSearchEntity.setDateCreated(LocalDate.now());

            // spremi u bazu
            flightSearchRepository.save(flightSearchEntity);
        }

        Params params = Params
                .with("originLocationCode", originLocationCode)
                .and("destinationLocationCode",destinationLocationCode)
                .and("departureDate",departureDate.toString())
                .and("returnDate", returnDate.toString())
                .and("adults", adults)
                .and("nonStop",true)
                .and("max",10);

        FlightOfferSearch[] flightOfferSearches = new FlightOfferSearch[0];
        try {
            flightOfferSearches = amadeus.shopping.flightOffersSearch.get(params);
            return Arrays.asList(flightOfferSearches);
        } catch (Exception e) {
            logger.error("getFlights neka greška: " + e.getMessage(),e);
            return Collections.emptyList();
        }



    }
}
