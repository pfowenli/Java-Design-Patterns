package com.designPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String title;
	private Double seniority;
	private List<Employee> subordinates = new ArrayList<Employee>();
	
	public Employee(String name, String title, Double seniority) {
		this.name = name;
		this.title = title;
		this.seniority = seniority;
	}
	
	public void add(Employee employee) {
		subordinates.add(employee);
	}
	
    public void remove(Employee employee) {
		subordinates.remove(employee);
	}
    
    public List<Employee> getSubordinates() {
    	return subordinates;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", title=" + title + ", seniority=" + seniority + "]";
	}
}
