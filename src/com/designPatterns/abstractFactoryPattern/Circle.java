package com.designPatterns.abstractFactoryPattern;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw() method has been called.");
	}
	
}