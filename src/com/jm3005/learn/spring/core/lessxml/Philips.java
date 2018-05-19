package com.jm3005.learn.spring.core.lessxml;

import org.springframework.stereotype.Component;

@Component
public class Philips implements MusicSystem {

	@Override
	public void playMusic() {
		System.out.println("Playing music on Philips music system");
	}

}
