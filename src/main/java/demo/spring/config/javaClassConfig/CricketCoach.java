package demo.spring.config.javaClassConfig;

public class CricketCoach implements Coach {
    private SuggestionsService suggestionsService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
    }

    public void setSuggestionsService(SuggestionsService suggestionsService) {
        this.suggestionsService = suggestionsService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling 15 mins a day";
    }

    @Override
    public String getDailySuggestions() {
        return suggestionsService.getSuggestions();
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
