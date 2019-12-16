package com.ia.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"abc","def","efg", "kakashi"
	};
	
	//create a random number generator
	public Random random = new Random();

	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
