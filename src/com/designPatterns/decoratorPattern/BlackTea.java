package com.designPatterns.decoratorPattern;

public class BlackTea implements Tea {

	@Override
	public void make() {
		System.out.println("Tea: Black Tea");
	}

}
