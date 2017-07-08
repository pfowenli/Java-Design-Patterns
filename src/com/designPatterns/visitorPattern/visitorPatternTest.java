package com.designPatterns.visitorPattern;

public class visitorPatternTest {

	public static void main(String[] args) {
		ConcreteElement1 concreteElement1 = new ConcreteElement1();
		ConcreteElement2 concreteElement2 = new ConcreteElement2();
		ConcreteElement3 concreteElement3 = new ConcreteElement3();
		
		ConcreteVisitor concretVisitor1 = new ConcreteVisitor("visitor 1");
		ConcreteVisitor concretVisitor2 = new ConcreteVisitor("visitor 2");
		
		concreteElement1.acept(concretVisitor1);
		concreteElement2.acept(concretVisitor2);
		concreteElement3.acept(concretVisitor2);
		
		System.out.println("period 1:");
		System.out.println("concreteElement1 was last visited by "+concreteElement1.getLastVisitedBy());
		System.out.println("concreteElement2 was last visited by "+concreteElement2.getLastVisitedBy());
		System.out.println("concreteElement3 was last visited by "+concreteElement3.getLastVisitedBy());
		
		concreteElement1.acept(concretVisitor1);
		concreteElement2.acept(concretVisitor2);
		concreteElement2.acept(concretVisitor1);
		concreteElement3.acept(concretVisitor2);
		
		System.out.println("period 2:");
		System.out.println("concreteElement1 was last visited by "+concreteElement1.getLastVisitedBy());
		System.out.println("concreteElement2 was last visited by "+concreteElement2.getLastVisitedBy());
		System.out.println("concreteElement3 was last visited by "+concreteElement3.getLastVisitedBy());
	}
}
