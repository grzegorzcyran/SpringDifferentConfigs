package demo.spring.config.annotationConfig;

import org.springframework.stereotype.Component;

/**
 * @Component to najbardziej ogólna anotacja mówiąca Springowi że to on
 * jest odpowiedzialny za tworzenie obiektów danej klasy
 *
 * Każdy Repository, Service, Controller, RestController jest jednocześnie Component tylko
 * z dodatkowymi cechami
 */
@Component
public class HappySuggestionsService implements SuggestionsService {

    public HappySuggestionsService() {
    }

    @Override
    public String getSuggestions() {
        return "Today is your lucky day";
    }
}
