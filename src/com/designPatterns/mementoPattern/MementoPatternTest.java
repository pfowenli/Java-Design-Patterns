package com.designPatterns.mementoPattern;

public class MementoPatternTest {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("state 1");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("state 2");
		originator.setState("state 3");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("state 4");
		careTaker.add(originator.saveStateToMemento());
		
		System.out.println("Current state: " + originator.getState());
		
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("1st state: " + originator.getState());
		
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("2nd state: " + originator.getState());
		
		originator.getStateFromMemento(careTaker.get(2));
		System.out.println("3rd state: " + originator.getState());
	}

}
