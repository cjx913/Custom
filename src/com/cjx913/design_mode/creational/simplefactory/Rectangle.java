package com.cjx913.design_mode.creational.simplefactory;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle.draw()");

	}

	@Override
	public void erase() {
		System.out.println("Rectangle.erase()");

	}

}
