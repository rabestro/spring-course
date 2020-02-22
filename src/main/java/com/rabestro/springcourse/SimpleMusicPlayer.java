package com.rabestro.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleMusicPlayer {
	private ClassicalMusic music;
	
	@Autowired
	public SimpleMusicPlayer(ClassicalMusic music) {
		this.music = music;
	}
	
	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}
}
