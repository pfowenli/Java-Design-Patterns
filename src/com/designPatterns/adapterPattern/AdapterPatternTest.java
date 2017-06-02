package com.designPatterns.adapterPattern;

public class AdapterPatternTest {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "let me love you.mp3");
		audioPlayer.play("m4a", "beauty and the beasts.m4a");
		audioPlayer.play("mp4", "good life.mp4");
		audioPlayer.play("avi", "shake it off.avi");
	}

}
