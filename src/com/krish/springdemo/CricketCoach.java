package com.krish.springdemo;

import java.util.Random;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String teamName;
	
	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmail() {
		return email;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Plank 5 mins";
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		Random randomGen = new Random();
		int i = randomGen.nextInt(fortuneService.getFortune().length);
		return "Oh yeah: " + fortuneService.getFortune()[i];
	}

}
