package com.designPatterns.nullObjectPattern;

public class MemberFactory {
	
	public static final String[] identifiers = {"A076", "A317", "B131", "C247"};
	
	public static AbstractMember getMember(String identifier) {
		for(int i=0; i<identifiers.length; i++) {
			if(identifiers[i].equalsIgnoreCase(identifier)) {
				return new RealMember(identifier);
			}
		}
		return new NullMember();
	}

}
