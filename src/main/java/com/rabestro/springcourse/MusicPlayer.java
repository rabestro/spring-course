package com.rabestro.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private Music music;
	private List<Music> musicList;
	private String name;
	private int volume;
	
	@Autowired
	public MusicPlayer(ArrayList<Music> musicList) {
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

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}

}
