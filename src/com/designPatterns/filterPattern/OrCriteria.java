package com.designPatterns.filterPattern;

import java.util.List;

public class OrCriteria implements Criteria {

	private Criteria criteria1;
	private Criteria criteria2;
	
	public OrCriteria(Criteria criteria1, Criteria criteria2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	@Override
	public List<Country> meetCriteria(List<Country> countries) {
		List<Country> selectedCountries = criteria1.meetCriteria(countries);
		List<Country> secondCriteriaCountries = criteria2.meetCriteria(countries);
		
		for (Country country: secondCriteriaCountries) {
			if (! selectedCountries.contains(country)) {
				selectedCountries.add(country);
			}
		}
		
		return selectedCountries;
	}

}
