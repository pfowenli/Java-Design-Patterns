package com.designPatterns.commandPattern;

public class AirConditioner {
	
	private String brand;
	private String version;
	
	public AirConditioner(String brand, String version) {
		this.brand = brand;
		this.version = version;
	}

	public void turnOn() {
		System.out.println("Air Conditioner "+brand+" "+version+" has been turned on.");
	}
	
	public void turnOff() {
		System.out.println("Air Conditioner "+brand+" "+version+" has been turned off.");
	}
	
	public void turnUp() {
		System.out.println("Air Conditioner "+brand+" "+version+" has been turned up.");
	}
	
	public void turnDown() {
		System.out.println("Air Conditioner "+brand+" "+version+" has been turned down.");
	}

}
