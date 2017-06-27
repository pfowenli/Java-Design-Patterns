package com.designPatterns.nullObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class NullPatternTest {

	public static void main(String[] args) {
		
		List<AbstractMember> members = new ArrayList<AbstractMember>();
		members.add(MemberFactory.getMember("A065"));
		members.add(MemberFactory.getMember("A317"));
		members.add(MemberFactory.getMember("B131"));
		members.add(MemberFactory.getMember("B209"));
		members.add(MemberFactory.getMember("C247"));
		
		System.out.println("member identifiers:");
		for(AbstractMember member: members) {
			System.out.println(member.getIdentifier());
		}

	}

}
