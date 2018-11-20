package com.cjx913.design_mode.creational.factorymethod;

public abstract class Image {
	protected String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public abstract void read();
}
