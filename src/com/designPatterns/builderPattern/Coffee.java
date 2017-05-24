package com.designPatterns.builderPattern;

public class Coffee extends Drink {

	@Override
	public String name() {
		return "Coffee";
	}

	@Override
	public Double price() {
		return 42.5d;
	}

}
