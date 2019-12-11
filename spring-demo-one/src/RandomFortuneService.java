
import java.util.Random;


public class RandomFortuneService implements FortuneService {
	
	
	//array of strings
	
	private String[] data = {
			"random fortune 0",
			"random fortune 1",
			"random fortune 2"
	};
	
	private Random myRandom = new Random();
	

	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String finalData = data[index];
		
		return finalData;
	}

}
