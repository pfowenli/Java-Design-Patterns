package com.designPatterns.builderPattern;

public class BuilderPatternTest {

	public static void main(String[] args) {
		MealSetBuilder mealSetBuilder = new MealSetBuilder();
		
		MealSet mealSet1 = mealSetBuilder.MealSetA();
		System.out.println("Meal Set A");
		mealSet1.displayItems();
		System.out.println("Total Cost: " + mealSet1.getCost() + "\n");
		
		MealSet mealSet2 = mealSetBuilder.MealSetB();
		System.out.println("Meal Set B");
		mealSet2.displayItems();
		System.out.println("Total Cost: " + mealSet2.getCost());

	}

}
