package com.ia.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
@Scope("prototype")
public class TennisCoach  implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService") 
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> Tenniscoach: inside default constructor");
	}
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
		fortuneService = theFortuneService; 
	}
	*/
	
	/*
	//constructor injection
	@Autowired
	 public TennisCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		 this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
