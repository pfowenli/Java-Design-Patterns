package com.designPatterns.strategyPattern;

public class StrategyPatternTest {
	
	public static void main(String[] args) {
		// set up shopping chart 1
		ShoppingChart shoppingChart1 = new ShoppingChart(new VIPStrategy());
		
		shoppingChart1.add(400, 2);
		
		// set up shopping chart 2
		ShoppingChart shoppingChart2 = new ShoppingChart(new MemberStrategy());
		
		shoppingChart2.add(350, 4);
		shoppingChart1.add(125, 3);
		
		System.out.println("Shopping chart 1");
		shoppingChart1.payBill();
		
		shoppingChart2.add(650, 1);
		
		System.out.println("Shopping chart 2");
		shoppingChart2.payBill();
	}
}
