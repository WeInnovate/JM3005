package com.jm3005.learn.spring.core.lessxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HondaCity implements Car {

	
	private MusicSystem musicSystem;
	
	@Value("${hondaCity.color}")
	private String color;

	@Override
	public void driveTheCar() {
		System.out.print("Driving "+color+" HondaCity and ");
		musicSystem.playMusic();
	}

	/*public HondaCity(MusicSystem musicSystem) {
		super();
		this.musicSystem = musicSystem;
	}
*/
	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	@Autowired
	@Qualifier("sony")
	public void setMusicSystemwgwefnqld(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
/*
	public HondaCity() {
		super();
		// TODO Auto-generated constructor stub
	}*/
}
