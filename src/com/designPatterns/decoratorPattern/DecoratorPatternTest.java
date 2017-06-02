package com.designPatterns.decoratorPattern;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		
		// pure tea
		Tea blackTea = new BlackTea();
		Tea oolongTea = new OolongTea();
		
		// favored tea
		Tea milkBlackTea = new MilkTeaSeasoner(new BlackTea());
		Tea milkOolongTea = new MilkTeaSeasoner(new OolongTea());
		
		System.out.println("Black Tea");
		blackTea.make();
		System.out.println("");
		
		System.out.println("Oolong Tea");
		oolongTea.make();
		System.out.println("");
		
		System.out.println("Milk Black Tea");
		milkBlackTea.make();
		System.out.println("");
		
		System.out.println("Milk Oolong Tea");
		milkOolongTea.make();
		System.out.println("");

	}

}
