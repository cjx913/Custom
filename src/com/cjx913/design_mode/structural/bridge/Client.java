package com.cjx913.design_mode.structural.bridge;

public class Client {

	public static void main(String[] args) {
		DataBse bse = new MySql();
		DataFile dataFile = new TxtDataFile();
		dataFile.setDataBase(bse);
		dataFile.parseFile();

	}

}
