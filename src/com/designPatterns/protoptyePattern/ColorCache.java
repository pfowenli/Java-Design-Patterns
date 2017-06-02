package com.designPatterns.protoptyePattern;

import java.util.Hashtable;

public class ColorCache {
	
	private static Hashtable<String, Color> colorHash = new Hashtable<String, Color>();
	
	// add three colors into colorHash
	public static void loadCache() {
		// build three colors
		Red color1 = new Red();
		Yellow color2 = new Yellow();
		Blue color3 = new Blue();
		
		// set id
		color1.setId("1");
		color2.setId("2");
		color3.setId("3");
		
		// put id (key)-color (value) pairs
		colorHash.put(color1.getId(), color1);
		colorHash.put(color2.getId(), color2);
		colorHash.put(color3.getId(), color3);
	}
	
	public static Color getColor(String colorId) {
		Color cachedColor = colorHash.get(colorId);
		return (Color) cachedColor.clone();
	}

}
