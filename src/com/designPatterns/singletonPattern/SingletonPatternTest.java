package com.designPatterns.singletonPattern;

public class SingletonPatternTest {

	public static void main(String[] args) {
		// Error: The constructor SingleObject() is not visible
		//SingleObject singleObject = new SingleObject();
		
		// get the only SingleObject object
		SingleObject singleObject = SingleObject.getInstance();
		
		// call displayMessage() method of singleObject
		singleObject.displayMessage();
	}

}
