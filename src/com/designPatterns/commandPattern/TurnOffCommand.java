package com.designPatterns.commandPattern;

public class TurnOffCommand implements Command {

	private AirConditioner airConditioner;
	
	public TurnOffCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() {
		airConditioner.turnOff();
	}

}
