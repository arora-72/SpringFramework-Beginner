
public class BaseballCoach implements Coach{
	
	
	//define private field for the dependency
	private FortuneService fortuneService;
	
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting cage";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune Service for getting data
		return fortuneService.getFortune();
	}

}
