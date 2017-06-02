package com.designPatterns.factoryPattern;

public class FactoryPatternTest {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// get an object of Rectangle, an object of Square and an object of Circle
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		Shape shape2 = shapeFactory.getShape("SQUARE");
		Shape shape3 = shapeFactory.getShape("CIRCLE");
		
		// call draw() methods of these objects
		shape1.draw();
		shape2.draw();
		shape3.draw();

	}

}
