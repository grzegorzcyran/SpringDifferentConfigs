package demo.spring.config.javaClassConfig;

import java.util.Random;

public class HardSuggestionsService implements SuggestionsService {

    String[] suggestions = new String[]{"Go on diet", "Use some weightlifting", "Go for jump rope"};
    int index;

    public HardSuggestionsService() {
    }

    @Override
    public String getSuggestions() {
        this.index = (new Random()).nextInt(3);
        return this.suggestions[this.index];
    }
}
