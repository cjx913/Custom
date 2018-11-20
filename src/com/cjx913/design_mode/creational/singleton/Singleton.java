package com.cjx913.design_mode.creational.singleton;

public class Singleton {
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return HolderClass.instance;
	}
	
	private static class HolderClass{
		private final static Singleton instance = new Singleton();
	}

}
