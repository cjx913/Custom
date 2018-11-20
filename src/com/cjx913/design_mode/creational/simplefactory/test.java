package com.cjx913.design_mode.creational.simplefactory;

public class test {

	public static void main(String[] args) {
		try {
			Shape shape = ShapeFactory.getShape(ShapeFactory.CIRCLE);
			shape.draw();
			shape.erase();
		} catch (UnsupportedShapeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
