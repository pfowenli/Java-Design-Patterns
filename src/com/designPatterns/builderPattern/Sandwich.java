package com.designPatterns.builderPattern;

public abstract class Sandwich implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract String name();
	
	@Override
	public abstract Double price();

}
