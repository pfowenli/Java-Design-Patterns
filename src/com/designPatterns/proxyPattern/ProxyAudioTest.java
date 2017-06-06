package com.designPatterns.proxyPattern;

public class ProxyAudioTest {

	public static void main(String[] args) {
		String fileName = "Nothing Gonna Change My Love For You.mp4";
		Audio audio = new ProxyAudio(fileName);
		
		// audio file will be loaded from storage
		audio.play();
		System.out.println("");
		
		// audio file won't be loaded from storage
		audio.play();
	}

}
