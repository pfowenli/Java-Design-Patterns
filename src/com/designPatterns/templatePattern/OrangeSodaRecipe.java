package com.designPatterns.templatePattern;

public class OrangeSodaRecipe extends BeverageRecipe {
	
	@Override
	public void prepareContainer() {
		System.out.println("prepare a mug");
	}
	
	@Override
	public void addIngredientOne() {
		System.out.println("pour soda");
	}

	@Override
	public void addIngredientTwo() {
		System.out.println("pour orange juice");
	}
}
