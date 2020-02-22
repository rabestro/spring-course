package com.rabestro.springcourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class SimpleMusicPlayer {
	private final Random randomGenerator = new Random();
	private Music rock;
	private Music jazz;
	private Music classic;
	
	@Value("${simpleMusicPlayer.name}")
	private String name;
	
	@Value("${simpleMusicPlayer.volume}")
	private int volume;
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	@Autowired
	public SimpleMusicPlayer(@Qualifier("rockMusic") Music rock, @Qualifier("jazzMusic") Music jazz,
			@Qualifier("classicalMusic") Music classic) {
		this.rock = rock;
		this.jazz = jazz;
		this.classic = classic;
	}

	public void playMusic() {
		System.out.println("Playing: " + rock.getSong());
	}

	public void playMusic(MusicalGenre genre) {
		final Music music;
		switch (genre) {
		case JAZZ:
			music = jazz;
			break;
		case ROCK:
			music = rock;
			break;
		case CLASSIC:
			music = classic;
			break;
		default:
			music = classic;
		}
		final List<String> musicList = music.getSongs();
		final String song = musicList.get(randomGenerator.nextInt(musicList.size()));

		System.out.println("Playing: " + song);
	}
}
