package com.cjx913.design_mode.structural.flyweight;

public abstract class Media {
	protected String name;
	public Media(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public abstract void display(MediaState mediaState) ;
}
