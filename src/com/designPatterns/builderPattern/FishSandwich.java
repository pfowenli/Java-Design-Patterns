package com.designPatterns.builderPattern;

public class FishSandwich extends Sandwich {

	@Override
	public String name() {
		return "Fish Sandwich";
	}

	@Override
	public Double price() {
		return 27.5d;
	}
}
