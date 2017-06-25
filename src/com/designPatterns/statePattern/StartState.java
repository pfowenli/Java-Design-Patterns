package com.designPatterns.statePattern;

public class StartState implements State {

	@Override
	public void handle(Context context) {
		System.out.println("Contest is in start state.");
		context.setState(this);
	}
	
	public String toString(){
		return "start state";
	}

}
