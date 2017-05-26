package com.designPatterns.protoptyePattern;

public class Yellow extends Color {

	public Yellow() {
		super.type = "Yellow";
	}

	@Override
	void fill() {
		System.out.println("Yellow::fill() method has been called.");
		
	}

}
