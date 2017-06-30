package com.designPatterns.strategyPattern;

public class MemberStrategy implements BillingStrategy {

	@Override
	public double calculatePrice(double rawPrice, int quantity) {
        double price = rawPrice * quantity;
		
		if (price >= 1000.0) {
			price = 0.85 * price;
		}
		return price;
	}
	
}
