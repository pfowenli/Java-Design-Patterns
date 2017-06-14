package com.designPatterns.interpreterPattern;

import java.util.ArrayList;
import java.util.List;

public class InterpreterPatternTest {

	public static void main(String[] args) {
		
		String roman = "MCMLIX";
		Context context = new Context(roman);
		
		List<Expression> parseTree = new ArrayList<Expression>();
		parseTree.add(new ThousandExpression());
		parseTree.add(new HundredExpression());
		parseTree.add(new TenExpression());
		parseTree.add(new OneExpression());
		
		for (Expression expression: parseTree) {
			expression.interpret(context);
		}
		
		System.out.println(roman + ": " + Integer.toString(context.getOutput()));
		
	}

}
