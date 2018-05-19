package com.jm3005.learn.spring.core.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bmw implements Car {

	@Autowired
	@Qualifier("philips")
	private MusicSystem musicSystem;

	@Value("${hondaCity.color}")
	private String color;

	@Override
	public void drive() {
		System.out.println(
				"Driving " + color + " " + this.getClass().getSimpleName() + " and " + musicSystem.playMusic());
	}

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
