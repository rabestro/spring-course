package com.rabestro.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*
		 * MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		 * musicPlayer.playMusic(); System.out.println(musicPlayer.getName());
		 * System.out.println(musicPlayer.getVolume()); musicPlayer.playMusicList();
		 */
		
		SimpleMusicPlayer musicPlayer = context.getBean("simpleMusicPlayer", SimpleMusicPlayer.class);
		musicPlayer.playMusic();
		
		context.close();
	}
}