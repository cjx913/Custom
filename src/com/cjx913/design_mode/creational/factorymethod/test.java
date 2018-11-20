package com.cjx913.design_mode.creational.factorymethod;

public class test {

	public static void main(String[] args) {
		ImageReader reader = new GifReader();
		Image image = reader.createReader();
		image.read();
	}

}
