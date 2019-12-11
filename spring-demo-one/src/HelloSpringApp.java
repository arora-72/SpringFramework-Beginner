import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from the container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods to the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
