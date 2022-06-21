package demo.spring.config.javaClassConfig;

public class HappySuggestionsService implements SuggestionsService {
    public HappySuggestionsService() {
    }

    @Override
    public String getSuggestions() {
        return "Today is your lucky day";
    }
}
