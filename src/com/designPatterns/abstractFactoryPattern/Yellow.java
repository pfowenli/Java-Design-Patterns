package com.designPatterns.abstractFactoryPattern;

public class Yellow implements Color {

	@Override
	public void fill() {
		System.out.println("Yellow::fill() method has been called.");
	}

}
