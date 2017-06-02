package com.designPatterns.decoratorPattern;

public class TeaSeasoner implements Tea {

	protected Tea seasonedTea;
	
	public TeaSeasoner(Tea seasonedTea) {
		this.seasonedTea = seasonedTea;
	}
	
	@Override
	public void make() {
		this.seasonedTea.make();
	}

}
