package com.jm3005.learn.spring.core.xml.di;

public class Audi implements Car {

	private MusicSystem musicSystem;
	
	private Integer speed;
	
	private String color;

	@Override
	public void driveTheCar() {
		System.out.println("Driving "+color+" Audi with speed of "+ speed +" "+ color +" and");
		musicSystem.playMusic();
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Audi(MusicSystem musicSystem, Integer speed) {
		super();
		this.musicSystem = musicSystem;
		this.speed = speed;
	}
	
	public Audi(MusicSystem musicSystem, String color) {
		super();
		this.musicSystem = musicSystem;
		this.color = color;
	}

	public Audi() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
