package com.jm3005.learn.spring.di.why;

public class Audi implements Car {

	private MusicSystem musicSystem;
	
	private Integer speed;

	@Override
	public void driveTheCar() {
		System.out.println("Driving Audi with speed of "+ speed +" and");
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

}
