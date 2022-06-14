package demo.spring.config.annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
    private SuggestionsService suggestionsService;
    private String name;

    public BaseBallCoach(@Autowired @Qualifier("hardSuggestionsService") SuggestionsService suggestionsService, @Value("SampleValue") String name) {
        this.suggestionsService = suggestionsService;
        this.name = name;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on batting practise";
    }

    @Override
    public String getDailySuggestions() {
        return suggestionsService.getSuggestions();
    }

    public String getName() {
        return name;
    }
}
