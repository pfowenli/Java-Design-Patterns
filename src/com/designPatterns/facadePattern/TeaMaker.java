package com.designPatterns.facadePattern;

public class TeaMaker {
	
	private Tea blackTea;
	private Tea greenTea;
	private Tea oolongTea;
	
	public TeaMaker() {
		blackTea = new BlackTea();
		greenTea = new GreenTea();
		oolongTea = new OolongTea();
	}
	
	public void serveBlackTea() {
		blackTea.serve();
	}
	
	public void serveGreenTea() {
		greenTea.serve();
	}
	
	public void serveOolongTea() {
		oolongTea.serve();
	}

}
