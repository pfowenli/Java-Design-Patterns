package com.designPatterns.visitorPattern;

public class ConcreteElement1 implements ElementInterface {
	
	private String lastVisitedBy;
	
	@Override
	public void acept(VisitorInterface visitor) {
		visitor.visit(this);
	}

	public String getLastVisitedBy() {
		return lastVisitedBy;
	}

	public void setLastVisitedBy(String lastVisitedBy) {
		this.lastVisitedBy = lastVisitedBy;
	}
}
