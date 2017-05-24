package com.designPatterns.abstractFactoryPattern;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Blue::fill() method has been called.");
	}

}
