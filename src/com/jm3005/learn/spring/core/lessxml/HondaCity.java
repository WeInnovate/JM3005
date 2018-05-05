package com.jm3005.learn.spring.core.lessxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaCity implements Car {

	
	private MusicSystem musicSystem;

	@Override
	public void driveTheCar() {
		System.out.print("Driving HondaCity and ");
		musicSystem.playMusic();
	}

	public HondaCity(MusicSystem musicSystem) {
		super();
		this.musicSystem = musicSystem;
	}

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	@Autowired
	public void setMusicSystemwgwefnqld(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}
}
