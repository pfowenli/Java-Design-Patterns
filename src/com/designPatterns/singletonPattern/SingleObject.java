package com.designPatterns.singletonPattern;

public class SingleObject {
	
	// get an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	// make private constructor to prevent initialization of the class
	private SingleObject() {
	}
	
	// get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void displayMessage() {
		System.out.println("SingleObject::displayMessage() method has been called.");
	}

}
