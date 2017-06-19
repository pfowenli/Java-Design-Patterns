package com.designPatterns.observerPattern;

public class ObserverPatternTest {

	public static void main(String[] args) {
		SensorSystem sensorSystem = new SensorSystem();
		
		new Lighting(sensorSystem);
		new Gates(sensorSystem);
		new Surveillance(sensorSystem);
		
		sensorSystem.soundTheAlarm();
	}

}
