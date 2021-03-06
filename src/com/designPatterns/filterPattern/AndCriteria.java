package com.designPatterns.filterPattern;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria criteria1;
	private Criteria criteria2;
	
	public AndCriteria(Criteria criteria1, Criteria criteria2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	@Override
	public List<Country> meetCriteria(List<Country> countries) {
		List<Country> selectedCountries = null;
		selectedCountries = criteria1.meetCriteria(countries);
		selectedCountries = criteria2.meetCriteria(selectedCountries);
		return selectedCountries;
	}

}
