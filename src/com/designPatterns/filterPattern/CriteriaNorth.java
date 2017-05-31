package com.designPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaNorth implements Criteria {

	@Override
	public List<Country> meetCriteria(List<Country> countries) {
		List<Country> northCountries = new ArrayList<Country>();
		
		for (Country country: countries) {
			if (country.getLatitude().equalsIgnoreCase("NORTH")) {
				northCountries.add(country);
			}
		}
		
		return northCountries;
	}

}
