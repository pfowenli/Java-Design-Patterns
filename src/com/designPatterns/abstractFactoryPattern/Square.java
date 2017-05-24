package com.designPatterns.abstractFactoryPattern;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw() method has been called.");
	}
	
}