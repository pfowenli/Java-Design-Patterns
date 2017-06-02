package com.designPatterns.builderPattern;

public class ChickenSandwich extends Sandwich {

	@Override
	public String name() {
		return "Chicken Sandwich";
	}

	@Override
	public Double price() {
		return 47.5d;
	}

}
