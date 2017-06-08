package com.designPatterns.commandPattern;

public class TurnUpCommand implements Command {

	private AirConditioner airConditioner;
	
	public TurnUpCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() {
		airConditioner.turnUp();
	}

}
