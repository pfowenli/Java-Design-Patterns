package com.designPatterns.interpreterPattern;

public class OneExpression extends Expression {

	@Override
	public String one() {
		// 1
		return "I";
	}

	@Override
	public String four() {
		// -1 + 5
		return "IV";
	}

	@Override
	public String five() {
		// 5
		return "V";
	}

	@Override
	public String nine() {
		// -1 + 10
		return "IX";
	}

	@Override
	public int multiplier() {
		return 1;
	}

}
