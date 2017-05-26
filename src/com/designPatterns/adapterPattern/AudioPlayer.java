package com.designPatterns.adapterPattern;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		// built-in function: play mp3 files
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("The mp3 file " + fileName + " has been played.");
		}
		
		// mediaAdapter provides support to play other file formats
		else if (audioType.equalsIgnoreCase("m4a") | audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		
		else {
			System.out.println("Invalid file format. " + audioType + " format is not supported.");
		}
		
	}

}
