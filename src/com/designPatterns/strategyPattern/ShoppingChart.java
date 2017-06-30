package com.designPatterns.strategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingChart {
	
	private List<Double> itemsets = new ArrayList<Double>();
	private BillingStrategy billingStrategy;
	
	public ShoppingChart(BillingStrategy billingStrategy) {
		this.billingStrategy = billingStrategy;
	}
	
	public void setBillingStrategy(BillingStrategy billingStrategy) {
		this.billingStrategy = billingStrategy;
	}

	public void add(double rawPrice, int quantity) {
		itemsets.add(billingStrategy.calculatePrice(rawPrice, quantity));
	}
	
	public void payBill() {
		double total = 0.0d;
		for (Double itemset: itemsets) {
			total += itemset;
		}
		System.out.println("Total: " + total);
		itemsets.clear();
	}
}
