package com.designPatterns.bridgePattern;

public class RedCube implements DrawAPI {

	@Override
	public void drawCube(int x, int y, int z) {
		System.out.println("Draw cube [color: red" + ", x: " + x + ", y: " + y + ", z: " + z + "]");
		
	}

}
