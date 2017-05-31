package com.designPatterns.filterPattern;

public class Country {
	
	private String name;
	private String longitude;
	private String latitude;
	
	public Country(String name, String longitude, String latitude) {
		super();
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getName() {
		return name;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getLatitude() {
		return latitude;
	}
}
