package com.cjx913.design_mode.structural.bridge;

public abstract class DataFile {
	
	protected DataBse dataBse;
	
	public void setDataBase(DataBse dataBse) {
		this.dataBse = dataBse;
	}
	
	public abstract void parseFile();
	
	

}
