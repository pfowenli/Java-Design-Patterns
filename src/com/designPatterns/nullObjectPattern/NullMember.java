package com.designPatterns.nullObjectPattern;

public class NullMember extends AbstractMember {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getIdentifier() {
		return "inavailable in member list";
	}

}
