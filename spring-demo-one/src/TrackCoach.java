
public class TrackCoach implements Coach {
	
	public FortuneService fortuneService;
	
	public  TrackCoach() {
	
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "daily fortune track coach";
	}
	
	
	//add init method
	public void doStartupStuff() {
		System.out.println("trackCoach: startup stuff");
	}
	
	public void doCleanupStuff() {
		System.out.println("trackCoach: cleaup stuff");
	}

}
