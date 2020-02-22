package com.rabestro.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static com.rabestro.springcourse.MusicalGenre.*;

public class TestSpring {

	public static void main(String[] args) {

		final var context = new AnnotationConfigApplicationContext(SpringConfig.class);

		/*
		 * MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		 * musicPlayer.playMusic(); System.out.println(musicPlayer.getName());
		 * System.out.println(musicPlayer.getVolume()); musicPlayer.playMusicList();
		 */

		SimpleMusicPlayer musicPlayer = context.getBean("simpleMusicPlayer", SimpleMusicPlayer.class);

		System.out.println(musicPlayer.getName());
		System.out.println("Volume: " + musicPlayer.getVolume());

		musicPlayer.playMusic(CLASSIC);
		musicPlayer.playMusic(CLASSIC);
		musicPlayer.playMusic(CLASSIC);
		musicPlayer.playMusic(CLASSIC);
		musicPlayer.playMusic(ROCK);
		musicPlayer.playMusic(ROCK);
		musicPlayer.playMusic(ROCK);
		musicPlayer.playMusic(JAZZ);
		musicPlayer.playMusic(JAZZ);
		musicPlayer.playMusic(JAZZ);

		context.close();
	}
}