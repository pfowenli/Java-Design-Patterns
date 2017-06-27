package com.designPatterns.nullObjectPattern;

public class RealMember extends AbstractMember {

	public RealMember(String identifier) {
		this.identifier = identifier;
	}
	
	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getIdentifier() {
		return identifier;
	}

}
