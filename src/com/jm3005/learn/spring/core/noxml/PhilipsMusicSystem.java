package com.jm3005.learn.spring.core.noxml;

import org.springframework.stereotype.Component;

@Component("philips")
public class PhilipsMusicSystem implements MusicSystem {

	@Override
	public String playMusic() {
		return "Playing music on " + this.getClass().getSimpleName();
	}

}
