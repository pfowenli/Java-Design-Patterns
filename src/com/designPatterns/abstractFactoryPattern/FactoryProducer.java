package com.designPatterns.abstractFactoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType) {
		
		if (factoryType.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		} else if (factoryType.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		
		return null;
	}

}
