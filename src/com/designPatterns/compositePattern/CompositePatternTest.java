package com.designPatterns.compositePattern;

public class CompositePatternTest {

	public static void main(String[] args) {
		
		Employee president = new Employee("Tom Hank", "president", 10.0d);
		
		Employee headInformation = new Employee("Richard Marx", "Head Information", 9.5d);
		Employee headExperiment = new Employee("John Barroman", "Head Experiment", 8.0d);
		
		Employee analyzerSenior = new Employee("Keanu Reeves", "Senior Analyzer", 7.0d);
		Employee analyzer = new Employee("Ellen Pompeo", "Analyzer", 3.5d);
		Employee technicianSenior = new Employee("Anne Hathaway", "Senior Technician", 7.5d);
		Employee technician = new Employee("Jared Lato", "Technician", 2.0d);
		
		president.add(headInformation);
		president.add(headExperiment);
		
		headInformation.add(analyzerSenior);
		headInformation.add(analyzer);
		headExperiment.add(technicianSenior);
		headExperiment.add(technician);
		
		
		System.out.println(president);
		
		for (Employee head: president.getSubordinates()) {
			System.out.println("\t" + head);
			
			for (Employee employee: head.getSubordinates()) {
				System.out.println("\t" + "\t" + employee);
			}
			
		}

	}

}
