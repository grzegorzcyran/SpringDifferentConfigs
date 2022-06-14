package demo.spring.config.annotationConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-application-context.xml");
        Coach theCoach1 = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(theCoach1.getDailySuggestions());
        System.out.println(theCoach1.getDailyWorkout());
        System.out.println(((CricketCoach) theCoach1).getTeam());

        System.out.println("==================");

        Coach theCoach2 = context.getBean("baseBallCoach", BaseBallCoach.class);

        System.out.println(theCoach2.getDailySuggestions());
        System.out.println(theCoach2.getDailyWorkout());


        context.close();
    }
}
