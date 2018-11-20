package com.cjx913.design_mode.creational.factorymethod;

public class GifReader implements ImageReader {

	@Override
	public Image createReader() {
		return new GifImage();
	}

}
