import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring container file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean isSame = (theCoach == alphaCoach);
		
		if(isSame) {
			System.out.println("\n both the beans generated are same");
		}else {
			System.out.println("\n both beans generated are not same");
		}
		
		System.out.println("\n memory location for theCoach: " + theCoach);
		System.out.println("\n memory location for alphaCoach: " + alphaCoach);
		
		
		context.close();

	}

}
