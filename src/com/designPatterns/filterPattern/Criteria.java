package com.designPatterns.filterPattern;

import java.util.List;

public interface Criteria {
	public List<Country> meetCriteria(List<Country> countries);
}
