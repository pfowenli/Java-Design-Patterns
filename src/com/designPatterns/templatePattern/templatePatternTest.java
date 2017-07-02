package com.designPatterns.templatePattern;

import java.util.ArrayList;
import java.util.List;

public class templatePatternTest {

	public static void main(String[] args) {
		List<BeverageRecipe> beverageRecipes = new ArrayList<BeverageRecipe>();
		beverageRecipes.add(new LemonGreenTeaRecipe());
		beverageRecipes.add(new MilkBlackTeaRecipe());
		beverageRecipes.add(new OrangeSodaRecipe());
		
		for(BeverageRecipe beverageRecipe: beverageRecipes) {
			System.out.println("beverage recipe: ");
			beverageRecipe.makeBeverage();
			System.out.println("");
		}

	}

}
