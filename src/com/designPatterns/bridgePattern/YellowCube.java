package com.designPatterns.bridgePattern;

public class YellowCube implements DrawAPI {

	@Override
	public void drawCube(int x, int y, int z) {
		System.out.println("Draw cube [color: yellow" + ", x: " + x + ", y: " + y + ", z: " + z + "]");
		
	}

}
