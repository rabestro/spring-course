package com.rabestro.springcourse;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {
	
	@PostConstruct
	public void init() {
		System.out.println("ClassicalMusic - Initialisation.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("ClassicalMusic - Destruction");
	}

	@Override
	public String getSong() {
		return "Hungarian Rhapsody";
	}

	@Override
	public List<String> getSongs() {
		return List.of("Für Elise", "Voices of Spring", "Eine kleine Nachtmusik");
	}
}