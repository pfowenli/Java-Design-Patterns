package com.designPatterns.bridgePattern;

import java.util.ArrayList;
import java.util.List;

public class bridgePatternTest {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Cube(3, 4, 5, new RedCube()));
		shapes.add(new Cube(4, 7, 10, new BlueCube()));
		shapes.add(new Cube(2, 5, 7, new YellowCube()));
		
		for (Shape shape: shapes) {
			shape.draw();
		}

	}

}
