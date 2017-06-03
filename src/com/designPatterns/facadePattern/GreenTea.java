package com.designPatterns.facadePattern;

public class GreenTea implements Tea {

	@Override
	public void serve() {
		System.out.println("The method GreenTea::serve() has been called.");
	}

}
