package com.designPatterns.abstractFactoryPattern;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Red::fill() method has been called.");
	}

}
