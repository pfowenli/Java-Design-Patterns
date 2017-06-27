package com.designPatterns.nullObjectPattern;

public abstract class AbstractMember {
	protected String identifier;
	
	public abstract boolean isNil();
	public abstract String getIdentifier();
}
