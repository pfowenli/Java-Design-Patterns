package com.designPatterns.chainOfResponsibilityPattern;

public class chainOfResponsibilityPattern {

	public static void main(String[] args) {
		
		DollarHandler dollarHandler1000 = new ThousandDollarHandler(1000);
		DollarHandler dollarHandler500 = new FiveHundredDollarHandler(500);
		DollarHandler dollarHandler100 = new HundredDollarHandler(100);
		DollarHandler dollarHandler50 = new FiftyDollarHandler(50);
		DollarHandler dollarHandler10 = new TenDollarHandler(10);
		DollarHandler dollarHandler5 = new FiveDollarHandler(5);
		DollarHandler dollarHandler1 = new OneDollarHandler(1);
		
		dollarHandler1000.setNextDollarHandler(dollarHandler500);
		dollarHandler500.setNextDollarHandler(dollarHandler100);
		dollarHandler100.setNextDollarHandler(dollarHandler50);
		dollarHandler50.setNextDollarHandler(dollarHandler10);
		dollarHandler50.setNextDollarHandler(dollarHandler5);
		dollarHandler5.setNextDollarHandler(dollarHandler1);
		
		int[] amounts = new int[]{5432, 6789, 4107};
		
		for (int amount: amounts) {
			System.out.println("The request amount: $"+amount);
			dollarHandler1000.handle(amount);
			System.out.println("");
		}

	}

}
