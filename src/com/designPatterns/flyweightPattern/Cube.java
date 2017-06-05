package com.designPatterns.flyweightPattern;

public class Cube implements Shape {
	private String color;
	private int x;
	private int y;
	private int z;
	
	public Cube(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void draw() {
		System.out.println("The method Circle:Draw() has been called. [color: " + color + ", x: " + x + ", y: " + y + ", z: " + z + "]");
		
	}

}
