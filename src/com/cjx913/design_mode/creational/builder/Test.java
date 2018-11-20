package com.cjx913.design_mode.creational.builder;

public class Test {

	public static void main(String[] args) {
		Window window = WindowController.construct(new MemoryWindowBuilder());
		System.out.println(window.toString());

	}

}
