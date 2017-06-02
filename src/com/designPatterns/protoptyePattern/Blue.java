package com.designPatterns.protoptyePattern;

public class Blue extends Color {

	public Blue() {
		super.type = "Blue";
	}

	@Override
	void fill() {
		System.out.println("Blue::fill() method has been called.");
		
	}

}
