package com.designPatterns.bridgePattern;

public class BlueCube implements DrawAPI {

	@Override
	public void drawCube(int x, int y, int z) {
		System.out.println("Draw cube [color: blue" + ", x: " + x + ", y: " + y + ", z: " + z + "]");
		
	}

}
