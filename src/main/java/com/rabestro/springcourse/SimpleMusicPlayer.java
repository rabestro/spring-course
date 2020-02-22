package com.rabestro.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimpleMusicPlayer {
	private Music music;
	
	@Autowired
	public SimpleMusicPlayer(@Qualifier("rockMusic") Music music) {
		this.music = music;
	}
	
	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}
}
