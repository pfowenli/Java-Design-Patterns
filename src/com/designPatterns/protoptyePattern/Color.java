package com.designPatterns.protoptyePattern;

public abstract class Color implements Cloneable {
	
	private String id;
	protected String type;
	
	abstract void fill();

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	protected Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}

}
