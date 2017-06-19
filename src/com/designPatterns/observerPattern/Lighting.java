package com.designPatterns.observerPattern;

public class Lighting extends AlarmListener {

	public Lighting(SensorSystem sensorSystem) {
		this.sensorSystem = sensorSystem;
		this.sensorSystem.attachAlarm(this);
	}
	
	@Override
	public void alarm() {
		System.out.println("lights up");	
	}

}
