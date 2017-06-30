package com.designPatterns.strategyPattern;

public interface BillingStrategy {
	double calculatePrice(double rawPrice, int quantity);
}
