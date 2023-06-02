package com.example.io.SbIOC;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice Baseball every day";
	}

}
