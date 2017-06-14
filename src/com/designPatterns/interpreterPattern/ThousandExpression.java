package com.designPatterns.interpreterPattern;

public class ThousandExpression extends Expression {

	@Override
	public String one() {
		// 1000
		return "M";
	}

	@Override
	public String four() {
		// undefined
		return " ";
	}

	@Override
	public String five() {
		// undefined
		return " ";
	}

	@Override
	public String nine() {
		// undefined
		return " ";
	}

	@Override
	public int multiplier() {
		return 1000;
	}

}
