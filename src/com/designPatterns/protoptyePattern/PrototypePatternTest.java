package com.designPatterns.protoptyePattern;

public class PrototypePatternTest {

	public static void main(String[] args) {
		ColorCache.loadCache();
		
		Color clonedColor1 = ColorCache.getColor("1");
		Color clonedColor2 = ColorCache.getColor("2");
		Color clonedColor3 = ColorCache.getColor("3");
		
		System.out.println("Clone color "+ clonedColor1.getId() + ": " + clonedColor1.getType());
		System.out.println("Clone color "+ clonedColor2.getId() + ": " + clonedColor2.getType());
		System.out.println("Clone color "+ clonedColor3.getId() + ": " + clonedColor3.getType());

	}

}
