package com.designPatterns.bridgePattern;

public class Cube extends Shape {

	private int x;
	private int y;
	private int z;
	
	public Cube (int x, int y, int z, DrawAPI drawAPI) {
		//Constructor call must be the first statement in a constructor
		super(drawAPI);
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public void draw() {
		drawAPI.drawCube(x, y, z);
	}

}
