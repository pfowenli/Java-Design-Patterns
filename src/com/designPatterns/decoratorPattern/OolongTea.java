package com.designPatterns.decoratorPattern;

public class OolongTea implements Tea {

	@Override
	public void make() {
		System.out.println("Tea: Oolong Tea");
	}

}
