package com.designPatterns.facadePattern;

public class BlackTea implements Tea {

	@Override
	public void serve() {
		System.out.println("The method BlackTea::serve() has been called.");
	}

}
