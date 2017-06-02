package com.designPatterns.builderPattern;

public class MealSetBuilder {
	
	public MealSet MealSetA() {
		MealSet mealSet = new MealSet();
		mealSet.addItem(new ChickenSandwich());
		mealSet.addItem(new MilkTea());
		return mealSet;
	}
	
	public MealSet MealSetB() {
		MealSet mealSet = new MealSet();
		mealSet.addItem(new FishSandwich());
		mealSet.addItem(new Coffee());
		return mealSet;
	}
}
