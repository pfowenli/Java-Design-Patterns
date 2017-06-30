package com.designPatterns.strategyPattern;

public class VIPStrategy implements BillingStrategy {

	@Override
	public double calculatePrice(double rawPrice, int quantity) {
        double price = rawPrice * quantity;
		
		if (price >= 500.0) {
			price = 0.75 * price;
		}
		return price;
	}
}
