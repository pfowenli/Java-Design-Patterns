package com.designPatterns.mediatorPattern;

public class MediatorPatternTest {

	public static void main(String[] args) {
		User owen = new User();
		User vanessa = new User();
		
		owen.setName("Owen");
		vanessa.setName("Vanessa");
		
		try {
			owen.sendMessage("Hallo! Vanessa.");
			Thread.sleep(2100);
			vanessa.sendMessage("Servus! Owen.");
			Thread.sleep(1500);
			owen.sendMessage("Wann kommst du nach Hause?");
			Thread.sleep(1800);
			vanessa.sendMessage("Morgen komme ich zur dir zu Hause.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
