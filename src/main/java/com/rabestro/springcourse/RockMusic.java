package com.rabestro.springcourse;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rockMusic")
@Scope("singleton")
public class RockMusic implements Music {
	
	@PostConstruct
	private void init() {
		System.out.println("RockMusic - Initialisation.");
	}

	@PreDestroy
	private void destroy() {
		System.out.println("RockMusic - Destruction");
	}
	
	@Override
	public String getSong() {
		
		return "Wind cries Mary";
	}

	@Override
	public List<String> getSongs() {
		
		return List.of("We will rock you", "Bohemian Rhapsody", "Whole Lotta Love");
	}

}
