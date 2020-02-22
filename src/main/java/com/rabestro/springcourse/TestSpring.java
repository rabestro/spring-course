package com.rabestro.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static com.rabestro.springcourse.MusicalGenre.*;

public class TestSpring {

	public static void main(String[] args) {

		final var context = new AnnotationConfigApplicationContext(SpringConfig.class);

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

		System.out.println(musicPlayer.getName());
		System.out.println("Volume: " + musicPlayer.getVolume());

		musicPlayer.playMusic();
		musicPlayer.playMusic();
		musicPlayer.playMusic();
		musicPlayer.playMusic();
		musicPlayer.playMusic();
		musicPlayer.playMusic();

		context.close();
	}
}