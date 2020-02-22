package com.rabestro.springcourse;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music {

	@Override
	public String getSong() {
		
		return "Wind cries Mary";
	}

	@Override
	public List<String> getSongs() {
		
		return List.of("We will rock you", "Bohemian Rhapsody", "Whole Lotta Love");
	}

}
