package com.krish.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting workout";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune()[0];
	}
	
}
