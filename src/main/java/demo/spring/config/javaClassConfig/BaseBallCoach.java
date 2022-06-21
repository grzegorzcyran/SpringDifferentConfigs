package demo.spring.config.javaClassConfig;

public class BaseBallCoach implements Coach {
    private SuggestionsService suggestionsService;
    private String name;

    public BaseBallCoach(SuggestionsService suggestionsService, String name) {
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
