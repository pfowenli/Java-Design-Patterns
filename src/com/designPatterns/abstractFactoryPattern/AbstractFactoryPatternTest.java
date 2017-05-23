package com.designPatterns.abstractFactoryPattern;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {
		
		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		// get an object of RED, an object of YELLOW, and an object of BLUE
		Color color1 = colorFactory.getColor("RED");
		Color color2 = colorFactory.getColor("YELLOW");
		Color color3 = colorFactory.getColor("BLUE");
		
		// call fill() method of RED, fill() method of YELLOW, and fill() method of BLUE
		color1.fill();
		color2.fill();
		color3.fill();
		
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		// get an object of Circle, an object of Rectangle, and an object of Square
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		Shape shape3 = shapeFactory.getShape("SQUARE");
				
		// call draw() method of Circle, draw() method of Rectangle, and draw() method of Square
		shape1.draw();
		shape2.draw();
		shape3.draw();

	}

}
