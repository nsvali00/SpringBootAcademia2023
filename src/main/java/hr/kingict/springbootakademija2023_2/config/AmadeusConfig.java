package hr.kingict.springbootakademija2023_2.config;

import com.amadeus.Amadeus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AmadeusConfig {

    @Bean
    public Amadeus getAmadeus(){
        return Amadeus
                .builder("0FegpAStnrl7glNdMLGs31WSqfv44jFN", "7ToyNxD8Uy4D77Bp")
                .build();
    }
}
