package com.rabestro.springcourse;

import java.util.List;

public class ClassicalMusic implements Music {
	private ClassicalMusic() {}
	
	public static ClassicalMusic getClassicalMusic() {
		System.out.println("ClassicalMusic - Factory method");
		return new ClassicalMusic();
	}
	
	public void init() {
		System.out.println("ClassicalMusic - Initialisation.");
	}

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