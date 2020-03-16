package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component/*("thatSillyCoach")*/
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice your backhang volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
