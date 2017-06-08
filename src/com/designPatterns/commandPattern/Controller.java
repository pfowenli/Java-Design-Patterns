package com.designPatterns.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	private List<Command> commands = new ArrayList<Command>();
	
	public void takeOrder(Command command) {
		commands.add(command);
	}
	
	public void placeOrders() {
		for (Command command: commands) {
			command.execute();
		}
		commands.clear();
	}

}
