package demo.spring.config.xmlConfig;

/**
 * Classic app, no Spring!!!
 */

public class ClassicApp {
    public static void main(String[] args) {
        Coach coach = new BaseBallCoach(new HappySuggestionsService(), "Old Trainer");
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailySuggestions());
    }
}
