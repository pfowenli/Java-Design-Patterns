package com.designPatterns.interpreterPattern;

public class HundredExpression extends Expression {

	@Override
	public String one() {
		// 100
		return "C";
	}

	@Override
	public String four() {
		// -100 + 500
		return "CD";
	}

	@Override
	public String five() {
		// 500
		return "D";
	}

	@Override
	public String nine() {
		// -100 + 1000
		return "CM";
	}

	@Override
	public int multiplier() {
		return 100;
	}

}
