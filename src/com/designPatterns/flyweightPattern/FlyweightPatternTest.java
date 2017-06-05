package com.designPatterns.flyweightPattern;

public class FlyweightPatternTest {
	private static final String colors[] = {"Red", "Yello", "Green", "Blue", "Black", "White"};
	
	public static void main(String[] args) {
		for(int i=0; i < 15; i++) {
			Cube cube = (Cube)ShapeFactory.getCube(getRandomColor());
			cube.setX(getRandomX());
			cube.setY(getRandomY());
			cube.setZ(getRandomZ());
			cube.draw();
		}
	}
	
	private static String getRandomColor() {
		return colors[(int)(Math.random() * colors.length)];
	}
	
	private static int getRandomX() {
		return (int)(40 + Math.random() * 60);
	}
	
	private static int getRandomY() {
		return (int)(30 + Math.random() * 70);
	}
	
	private static int getRandomZ() {
		return (int)(20 + Math.random() * 80);
	}

}
