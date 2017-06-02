package com.designPatterns.builderPattern;

public abstract class Drink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract String name();

	@Override
	public abstract Double price();
}
