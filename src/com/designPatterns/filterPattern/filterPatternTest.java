package com.designPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class filterPatternTest {
	
	public static void main(String[] args) {
		List<Country> countries = new ArrayList<Country>();
		
		countries.add(new Country("Taiwan", "east", "north"));
		countries.add(new Country("Australia", "east", "south"));
		countries.add(new Country("Cuba", "west", "south"));
		countries.add(new Country("Canada", "west", "north"));
		countries.add(new Country("Germany", "east", "north"));
		countries.add(new Country("Sweden", "east", "north"));
		
		// atomic criteria
		Criteria east = new CriteriaEast();
		Criteria west = new CriteriaWest();
		Criteria north = new CriteriaNorth();
		Criteria south = new CriteriaSouth();
		
		// combined criteria
		Criteria westAndNorth = new AndCriteria(west, north);
		Criteria eastOrSouth = new OrCriteria(east, south);
		
		System.out.println("East: ");
		displayCountries(east.meetCriteria(countries));
		System.out.println("");
		
		System.out.println("West: ");
		displayCountries(west.meetCriteria(countries));
		System.out.println("");
		
		System.out.println("North: ");
		displayCountries(north.meetCriteria(countries));
		System.out.println("");
		
		System.out.println("South: ");
		displayCountries(south.meetCriteria(countries));
		System.out.println("");
		
		System.out.println("West and north: ");
		displayCountries(westAndNorth.meetCriteria(countries));
		System.out.println("");
		
		System.out.println("east or south: ");
		displayCountries(eastOrSouth.meetCriteria(countries));
		System.out.println("");
	}
	
	public static void displayCountries(List<Country> countries) {
		for (Country country: countries) {
			System.out.println("Country [name: "+ country.getName() +", longitude: " + country.getLongitude() + ", latitude: " + country.getLatitude() + "]");
		}
	}

}
