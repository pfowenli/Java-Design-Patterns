package com.designPatterns.facadePattern;

public class facadePatternTest {

	public static void main(String[] args) {
		TeaMaker teamaker = new TeaMaker();
		
		teamaker.serveBlackTea();
		teamaker.serveGreenTea();
		teamaker.serveOolongTea();
	}

}
