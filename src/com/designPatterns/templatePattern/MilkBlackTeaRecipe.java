package com.designPatterns.templatePattern;

public class MilkBlackTeaRecipe extends BeverageRecipe {
	
	@Override
	public void prepareContainer() {
		System.out.println("prepare a cup");
	}
	
	@Override
	public void addIngredientOne() {
		System.out.println("pour black tea");
	}

	@Override
	public void addIngredientTwo() {
		System.out.println("pour milk");		
	}
}
