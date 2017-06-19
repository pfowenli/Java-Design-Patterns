package com.designPatterns.observerPattern;

public class Surveillance extends AlarmListener {

	public Surveillance(SensorSystem sensorSystem) {
		this.sensorSystem = sensorSystem;
		this.sensorSystem.attachAlarm(this);
	}
	
	@Override
	public void alarm() {
		System.out.println("Surveillance launchs");	
	}

}
