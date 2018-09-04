package com.krish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringWorld {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
				
		//Coach theCoach = new CricketCoach();
		
		//retrieving bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		/*now this will retrieve the bean, call the default constructor and 
		also the setter as we used setter injection in the Application Context*/
		
		CricketCoach newCoach = context.getBean("newCoach", CricketCoach.class);
		
		//calling the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(newCoach.getDailyFortune());
		System.out.println("Email: " + newCoach.getEmail());
		System.out.println("Team Name: " + newCoach.getTeamName());
		
		//closing the context
		context.close();
	}
}
