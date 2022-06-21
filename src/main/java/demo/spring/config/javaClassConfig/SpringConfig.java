package demo.spring.config.javaClassConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Beany można też definiować w klasie konfiguracyjnej, będzie ona oznaczona
 * anotacją Configuration
 */

@Configuration
@ComponentScan({"demo.spring.config.javaClassConfig"})
@PropertySource({"classpath:sport.properties"})
public class SpringConfig {

    public SpringConfig() {
    }

    @Value("${coach.name}")
    private String name;

    @Value("${team.name}")
    private String cricketTeam;

    @Bean
    public SuggestionsService happySuggestionsService() {
        return new HappySuggestionsService();
    }

    @Bean
    public SuggestionsService hardSuggestionsService() {
        return new HardSuggestionsService();
    }

    @Bean
    public Coach cricketCoach() {
        CricketCoach coach = new CricketCoach();
        coach.setSuggestionsService(hardSuggestionsService());
        coach.setEmailAddress("random@address.com");
        coach.setTeam(cricketTeam);
        return coach;
    }

    @Bean
    public Coach hardBaseballCoach() {
        return new BaseBallCoach(this.happySuggestionsService(), "easyCoach");
    }

    @Bean
    public Coach easyBaseballCoach() {
        return new BaseBallCoach(this.hardSuggestionsService(), name);
    }
}
