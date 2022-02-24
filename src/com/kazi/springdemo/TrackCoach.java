package com.kazi.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 2 km";
	}

	@Override
	public String getDailyFortune() {
		return "This is it: " + fortuneService.getFortune();
	}

}
