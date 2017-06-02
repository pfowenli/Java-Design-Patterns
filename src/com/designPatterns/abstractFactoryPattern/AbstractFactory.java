package com.designPatterns.abstractFactoryPattern;

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
	abstract Color getColor(String color);
}
