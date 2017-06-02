package com.designPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSouth implements Criteria {

	@Override
	public List<Country> meetCriteria(List<Country> countries) {
		List<Country> southCountries = new ArrayList<Country>();
		
		for (Country country: countries) {
			if (country.getLatitude().equalsIgnoreCase("SOUTH")) {
				southCountries.add(country);
			}
		}
		
		return southCountries;
	}

}
