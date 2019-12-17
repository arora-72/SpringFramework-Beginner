package com.ia.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retreive bean from spring container
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//print out the result
		System.out.println("\n pointing to the same object " + result);
		System.out.println("\n memory location of the object " + theCoach);
		System.out.println("\n memory location of the alphaCoach " + alphaCoach + "\n");
		
		
		context.close();
		
	}

}
