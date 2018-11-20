package com.cjx913.design_mode.creational.simplefactory;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle.draw()");

	}

	@Override
	public void erase() {
		System.out.println("Circle.erase()");

	}

}
