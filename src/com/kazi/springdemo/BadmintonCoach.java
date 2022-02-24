package com.kazi.springdemo;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Train for an hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
