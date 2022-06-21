package demo.spring.config.javaClassConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        /**
         * Poniżej, w kontekście definiujemy TABLICĘ klas konfiguracyjnych,
         * w naszym przypadku jednoelementową, zawartością tablicy jest
         * wskazanie klasy SpringConfig
         *
         */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new Class[]{SpringConfig.class});

        Coach cricketCoach = context.getBean("cricketCoach", Coach.class);

        System.out.println("========================");
        System.out.println("Coach krykieta");
        System.out.println(cricketCoach.getDailySuggestions());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(((CricketCoach) cricketCoach).getTeam());
        System.out.println(((CricketCoach) cricketCoach).getEmailAddress());
        System.out.println("========================");

        System.out.println("========================");
        Coach easyBaseballCoach = context.getBean("easyBaseballCoach", Coach.class);
        System.out.println("Pierwszy coach baseballa");
        System.out.println(easyBaseballCoach.getDailyWorkout());
        System.out.println(easyBaseballCoach.getDailySuggestions());
        System.out.println("========================");

        System.out.println("========================");
        Coach hardBaseballCoach = context.getBean("hardBaseballCoach", Coach.class);
        System.out.println("Drugi coach baseballa");
        System.out.println(hardBaseballCoach.getDailyWorkout());
        System.out.println(hardBaseballCoach.getDailySuggestions());
        System.out.println("========================");

        context.close();
    }
}
