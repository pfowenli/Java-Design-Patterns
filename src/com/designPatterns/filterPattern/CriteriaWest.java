package com.designPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaWest implements Criteria {

	@Override
	public List<Country> meetCriteria(List<Country> countries) {
		List<Country> westCountries = new ArrayList<Country>();
		
		for (Country country: countries) {
			if (country.getLongitude().equalsIgnoreCase("WEST")) {
				westCountries.add(country);
			}
		}
		
		return westCountries;
	}

}
