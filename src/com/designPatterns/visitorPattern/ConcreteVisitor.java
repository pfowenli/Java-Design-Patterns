package com.designPatterns.visitorPattern;

public class ConcreteVisitor implements VisitorInterface {
	
	private String name;

	public ConcreteVisitor(String name) {
		super();
		this.name = name;
	}

	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		concreteElement1.setLastVisitedBy(name);
	}

	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		concreteElement2.setLastVisitedBy(name);
	}
	
	@Override
	public void visit(ConcreteElement3 concreteElement3) {
		concreteElement3.setLastVisitedBy(name);
	}
}
