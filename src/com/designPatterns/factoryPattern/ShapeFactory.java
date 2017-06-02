package com.designPatterns.factoryPattern;

public class ShapeFactory {
	// getShape() method aims to get object of shape type
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else {
			return null;
		}
	}
}