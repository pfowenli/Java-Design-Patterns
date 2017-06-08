package com.designPatterns.commandPattern;

public class CommandPatternTest {

	public static void main(String[] args) {
		
		AirConditioner airConditioner1 = new AirConditioner("Cool Tech", "13.6");
		AirConditioner airConditioner2 = new AirConditioner("Mini Cool Tech", "12.1");
		
		Controller controller = new Controller();
		
		controller.takeOrder(new TurnOnCommand(airConditioner1));
		controller.takeOrder(new TurnOnCommand(airConditioner2));
		controller.takeOrder(new TurnUpCommand(airConditioner1));
		controller.takeOrder(new TurnDownCommand(airConditioner1));
		controller.takeOrder(new TurnUpCommand(airConditioner2));
		controller.takeOrder(new TurnOffCommand(airConditioner1));
		
		controller.placeOrders();
	}

}
