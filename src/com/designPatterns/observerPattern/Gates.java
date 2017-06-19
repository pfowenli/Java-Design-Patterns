package com.designPatterns.observerPattern;

public class Gates extends AlarmListener {

	public Gates(SensorSystem sensorSystem) {
		this.sensorSystem = sensorSystem;
		this.sensorSystem.attachAlarm(this);
	}
	
	@Override
	public void alarm() {
		System.out.println("gates close");	
	}

}
