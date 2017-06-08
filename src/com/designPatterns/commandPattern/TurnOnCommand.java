package com.designPatterns.commandPattern;

public class TurnOnCommand implements Command {

	private AirConditioner airConditioner;
	
	public TurnOnCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() {
		airConditioner.turnOn();
	}

}
