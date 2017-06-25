package com.designPatterns.statePattern;

public class StatePatternTest {

	public static void main(String[] args) {
		Context context = new Context();
		StartState startState = new StartState();
		StopState stopState = new StopState();
		
		startState.handle(context);
		System.out.println(context.getState().toString());
		
		stopState.handle(context);
		System.out.println(context.getState().toString());
	}
}
