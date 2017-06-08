package com.designPatterns.commandPattern;

public class TurnDownCommand implements Command {

	private AirConditioner airConditioner;
	
	public TurnDownCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() {
		airConditioner.turnDown();
	}

}
