package com.designPatterns.iteratorPattern;

public class IteratorPatternTest {

	public static void main(String[] args) {
		
		ActivityRepository activitiesRepository = new ActivityRepository();
		
		for(Iterator iterator = activitiesRepository.getIterator(); iterator.hasNext(); ) {
			String activity = (String)iterator.next();
			System.out.println("Activity: " + activity);
		}
	}
}
