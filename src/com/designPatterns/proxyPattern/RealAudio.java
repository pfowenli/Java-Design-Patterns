package com.designPatterns.proxyPattern;

public class RealAudio implements Audio {

	private String fileName;
	
	public RealAudio(String fileName) {
		this.fileName = fileName;
		loadFromStorage(fileName);
	}

	@Override
	public void play() {
		System.out.println("Playing "+fileName);	
	}
	
	private void loadFromStorage(String fileName) {
		System.out.println("Loading "+fileName);
	}
}
