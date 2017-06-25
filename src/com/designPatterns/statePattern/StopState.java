package com.designPatterns.statePattern;

public class StopState implements State {

	@Override
	public void handle(Context context) {
		System.out.println("Context is in stop state.");
		context.setState(this);
	}
	
	public String toString() {
		return "start state";
	}

}
