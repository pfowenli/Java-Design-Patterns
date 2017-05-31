package com.designPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaEast implements Criteria {

	@Override
	public List<Country> meetCriteria(List<Country> countries) {
		List<Country> eastCountries = new ArrayList<Country>();
		
		for (Country country: countries) {
			if (country.getLongitude().equalsIgnoreCase("EAST")) {
				eastCountries.add(country);
			}
		}
		
		return eastCountries;
	}

}
