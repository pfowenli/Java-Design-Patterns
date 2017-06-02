package com.designPatterns.protoptyePattern;

public class Red extends Color {

	public Red() {
		super.type = "Red";
	}

	@Override
	void fill() {
		System.out.println("Red::fill() method has been called.");
		
	}

}
