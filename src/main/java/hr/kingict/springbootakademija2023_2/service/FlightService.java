package hr.kingict.springbootakademija2023_2.service;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.referencedata.Locations;
import com.amadeus.resources.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class FlightService {
    Logger logger = LoggerFactory.getLogger(FlightService.class);

    @Autowired
    private Amadeus amadeus;
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
}
