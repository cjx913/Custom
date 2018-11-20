package com.cjx913.design_mode.creational.factorymethod;

public class JpgReader implements ImageReader {

	@Override
	public Image createReader() {
		return new JpgImage();
	}

}
