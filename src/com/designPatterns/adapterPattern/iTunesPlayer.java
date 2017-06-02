package com.designPatterns.adapterPattern;

public class iTunesPlayer implements AdvancedMediaPlayer {

	@Override
	public void playM4a(String fileName) {
		System.out.println("The m4a file " + fileName + " has been played.");
	}

	@Override
	public void playMp4(String fileName) {
	}

}
