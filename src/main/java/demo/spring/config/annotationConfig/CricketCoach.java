package demo.spring.config.annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    private SuggestionsService suggestionsService;

    @Value("sample@address.com")
    private String emailAddress;

    //@Value("Hardcoded team")
    @Value("${team.name}")
    private String team;

    public CricketCoach() {
    }

    /**
     * podając @Qualifier należy pamiętać że Spring oczekuje nazwy beana a nie nazwy klasy
     * a jeśli nie nazwiemy Beana samodzielnie to domyślnie Spring weźmie nazwę klasy
     * i zmieni pierwszą literę na małą i to będzie nazwa beana: NazwaKlasy -> nazwaKlasy
     *
     * NIE DOTYCZY SYTUACJI gdzie więcej niż 1 litera na początku klasy jest duża
     * czyli klasa: JAKASPrzykladowaKlasa zamieni się na bean: JAKASPrzykladowaKlasa
     */
    @Autowired
    @Qualifier("happySuggestionsService")
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


    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
