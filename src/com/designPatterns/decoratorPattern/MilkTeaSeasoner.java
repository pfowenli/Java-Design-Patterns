package com.designPatterns.decoratorPattern;

public class MilkTeaSeasoner extends TeaSeasoner {

	public MilkTeaSeasoner(Tea seasonedTea) {
		super(seasonedTea);
	}

	@Override
	public void make() {
		seasonedTea.make();
		prepareSeasoning(seasonedTea);
	}
	
	private void prepareSeasoning(Tea seasonedTea) {
		System.out.println("Favor: Milk");
	}

}
