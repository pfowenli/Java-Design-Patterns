package com.designPatterns.abstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		return null;
	}

	@Override
	Color getColor(String color) {
		
		if (color == null) {
			return null;
		}
		
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("YELLOW")) {
			return new Yellow();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		
		return null;
	}

}
