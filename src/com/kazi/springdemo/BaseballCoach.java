package com.kazi.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return "Today's Fortune: " + fortuneService.getFortune();
	}
}
