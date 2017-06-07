package com.designPatterns.chainOfResponsibilityPattern;

public abstract class DollarHandler {
	
	protected int denomination;
	protected DollarHandler nextDollarHandler;
	
	public void setNextDollarHandler(DollarHandler nextDollarHandler) {
		this.nextDollarHandler = nextDollarHandler;
	}
	
	public void handle(int amount) {
		int notes = amount / denomination;
		int remainingAmount = amount % denomination;
		
		if (notes > 0) {
			System.out.println(this.getClass().getSimpleName() + " handled $" + denomination + " X " + notes + " = $" + (notes * denomination));
		}
		
		if (nextDollarHandler != null && remainingAmount > 0) {
			nextDollarHandler.handle(remainingAmount);
		}
	}
	
}
