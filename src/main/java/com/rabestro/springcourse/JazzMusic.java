package com.rabestro.springcourse;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jazzMusic")
@Scope("prototype")
public class JazzMusic implements Music {

	@Override
	public List<String> getSongs() {
		return List.of("So What", "Take Five", "All Blues");
	}

	@Override
	public String getSong() {
		
		return "St. James Infirmary";
	}

}
