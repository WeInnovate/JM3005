package com.jm3005.learn.spring.core.noxml;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sony")
//@Scope("singlton")
public class SonyMusicSystem implements MusicSystem {

	@Override
	public String playMusic() {
		return "Playing music on " + this.getClass().getSimpleName();
	}

}
