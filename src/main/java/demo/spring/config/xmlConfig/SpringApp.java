package demo.spring.config.xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {

        /**
         * ClassPathXmlApplicationContext definiuje "kontekst" Springa, czyli określa
         * skąd pobierać obiekty niezbędnych klas (np. obiekt klasy Coach)
         * Kontekst przejmuje "sterowanie" aplikacją w zakresie:
         *  - decyzji że tworzymy nowy obiekt
         *  - decyzji że jak klient prosi o obiekt to podajemy mu już istniejący - bo moźe już go gdzieś wcześniej
         *   ten sam kontekst utworzył
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println("=============================");
        System.out.println("Bean który jest inicjowany parametrami w konstruktorze");
        System.out.println("=============================");
        Coach someCoach = (Coach) context.getBean("baseballCoach");

        System.out.println(someCoach.getDailyWorkout());
        System.out.println(someCoach.getDailySuggestions());

        Coach anotherCoach = (Coach) context.getBean("baseballCoach");

        System.out.println(anotherCoach.getDailyWorkout());
        System.out.println(anotherCoach.getDailySuggestions());

        //
        System.out.println("=============================");
        System.out.println("Bean który jest inicjowany parametrami w setterach");
        System.out.println("=============================");
        Coach cricketCoach = (Coach) context.getBean("cricketCoach");
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailySuggestions());
        System.out.println(((CricketCoach) cricketCoach).getTeam());

        System.out.println("\n Drugi bean, ale nie z wszystkimi polami ustawionymi\n");
        Coach otherCricketCoach = (Coach) context.getBean("anotherCricketCoach");
        System.out.println(otherCricketCoach.getDailyWorkout());
        System.out.println(otherCricketCoach.getDailySuggestions());
        System.out.println(((CricketCoach) otherCricketCoach).getTeam());

        context.close(); //!!!
    }
}
