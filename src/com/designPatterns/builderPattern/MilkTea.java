package com.designPatterns.builderPattern;

public class MilkTea extends Drink {

	@Override
	public String name() {
		return "Milk Tea";
	}

	@Override
	public Double price() {
		return 25.0d;
	}
}
