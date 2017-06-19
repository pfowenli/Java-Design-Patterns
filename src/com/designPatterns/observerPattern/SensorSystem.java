package com.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class SensorSystem {
	
	private List<AlarmListener> alarmListeners = new ArrayList<AlarmListener>();
	
	public void attachAlarm(AlarmListener alarmListener) {
		alarmListeners.add(alarmListener);
	}
	
	public void soundTheAlarm() {
		for(AlarmListener alarmListener: alarmListeners) {
			alarmListener.alarm();
		}
	}
}
