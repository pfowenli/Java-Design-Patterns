package com.designPatterns.adapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playM4a(String fileName) {
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("The mp4 file " + fileName + " has been played.");
		
	}

}
