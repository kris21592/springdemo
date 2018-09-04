package com.krish.springdemo;

public class FootballCoach implements Coach{

	private String email;
	private String teamName;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "You rock bro";
	}

}
