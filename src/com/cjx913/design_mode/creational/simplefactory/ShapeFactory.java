package com.cjx913.design_mode.creational.simplefactory;

public class ShapeFactory {
	public static final String CIRCLE = "circle"; 
	public static final String RECTANGLE = "rectangle"; 
	public static final String TRIANGLE = "triangle";
	
	public static Shape getShape(String shapeName) throws UnsupportedShapeException {
		Shape shape= null;
		if(shapeName.equalsIgnoreCase(CIRCLE)) {
			shape = new Circle();
		}else	if(shapeName.equalsIgnoreCase(RECTANGLE)) {
			shape = new Rectangle();
		}else	if(shapeName.equalsIgnoreCase(TRIANGLE)) {
			shape = new Triangle();
		}else {
			throw new UnsupportedShapeException();
		}
		return shape;
	}
	
	
}
