package com.designPatterns.templatePattern;

public class LemonGreenTeaRecipe extends BeverageRecipe {
	
	@Override
	public void prepareContainer() {
		System.out.println("prepare a mug");
	}
	
	@Override
	public void addIngredientOne() {
		System.out.println("pour green tea");
	}

	@Override
	public void addIngredientTwo() {
		System.out.println("pour lemon juice");
	}

}
