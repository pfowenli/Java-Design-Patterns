package com.designPatterns.adapterPattern;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("m4a")) {
			advancedMediaPlayer = new iTunesPlayer();
			
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
			
		}
	} 
	
	@Override
	public void play(String audioType, String fileName) {
		
		if (audioType.equalsIgnoreCase("m4a")) {
			advancedMediaPlayer.playM4a(fileName);
			
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
			
		}
		
	}

}
