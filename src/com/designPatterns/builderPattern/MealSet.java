package com.designPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class MealSet {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public Double getCost() {
		Double cost = 0.0d;
		
		for (Item item: items) {
			cost += item.price();
		}
		
		return cost;
	}
	
	public void displayItems() {
		for (Item item: items) {
			System.out.print("Name: " + item.name());
			System.out.print(", Packing: " + item.packing().pack());
			System.out.println(", Price: " + item.price());
		}
	}

}
