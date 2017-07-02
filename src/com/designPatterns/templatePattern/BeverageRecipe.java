package com.designPatterns.templatePattern;

public abstract class BeverageRecipe {
	
	public void makeBeverage() {
		prepareContainer();
		addIngredientOne();
		addIngredientTwo();
		addIceCubes();
	}
	
	public abstract void prepareContainer();
	public abstract void addIngredientOne();
	public abstract void addIngredientTwo();
	
	private void addIceCubes() {
		System.out.println("add ice cubes");
	}
	

}
