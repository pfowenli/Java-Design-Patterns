package com.designPatterns.interpreterPattern;

public class TenExpression extends Expression {

	@Override
	public String one() {
		// 10
		return "X";
	}

	@Override
	public String four() {
		// -10 + 50
		return "XL";
	}

	@Override
	public String five() {
		// 50
		return "L";
	}

	@Override
	public String nine() {
		// -10 + 100
		return "XC";
	}

	@Override
	public int multiplier() {
		return 10;
	}

}
