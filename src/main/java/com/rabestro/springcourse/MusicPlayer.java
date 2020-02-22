package com.rabestro.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private final Random randomGenerator = new Random();

	private List<Music> musicList;
	private String name;
	private int volume;
	
	@Autowired
	public MusicPlayer(List<Music> musicList) {
		this.musicList = musicList;
	}

	public void playMusicList() {
		musicList.forEach(music -> System.out.println("Playing: " + music.getSong()));
	}

	public List<Music> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}

	public String getName() {
		return name;
	}

	@Value("${simpleMusicPlayer.name}")
	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	@Value("${simpleMusicPlayer.volume}")
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void printMusicList() {
		musicList.forEach(music -> System.out.println(music.getSongs().size()));
	}

	public void playMusic() {
		final var music = musicList.get(randomGenerator.nextInt(this.musicList.size()));
		final var songs = music.getSongs();
		final var song = songs.get(randomGenerator.nextInt(songs.size()));
		System.out.println("Playing: " + song);
	}
}
