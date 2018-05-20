package com.jm3005.learn.spring.core.noxml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bmw implements Car {

	@Autowired
	@Qualifier("sony")
	private MusicSystem musicSystem;

	@Value("${hondaCity.color}")
	private String color;

	@Override
	public void drive() {
		System.out.println(
				"Driving " + color + " " + this.getClass().getSimpleName() + " and " + musicSystem.playMusic());
		System.out.println("Music System's hash code is: "+musicSystem.hashCode());
	}
	
	@PreDestroy
	public void myPreDestroy() {
		System.out.println("I'm in pre destroy.");
	}
	
	@PostConstruct
	public void myPostConstruct() {
		this.setColor("Black");
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
