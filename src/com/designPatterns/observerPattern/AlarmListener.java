package com.designPatterns.observerPattern;

public abstract class AlarmListener {
	
	protected SensorSystem sensorSystem;
	
	public abstract void alarm();

}
