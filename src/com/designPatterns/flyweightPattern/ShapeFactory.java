package com.designPatterns.flyweightPattern;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Shape> cubeHash = new HashMap<String, Shape>();
	
	public static Shape getCube(String color) {
		Cube cube = (Cube)cubeHash.get(color);
		
		if (cube == null) {
			cube = new Cube(color);
			cubeHash.put(color, cube);
			System.out.println("Creating cube in " + color + " color");
		}
		
		return cube;
	}

}
