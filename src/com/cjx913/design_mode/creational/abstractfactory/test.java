package com.cjx913.design_mode.creational.abstractfactory;


import com.cjx913.design_mode.creational.abstractfactory.unix.UnixUIFactory;

public class test {

	public static void main(String[] args) {
		UIFactory factory = new UnixUIFactory();
		Button button = factory.createButton();
		Text text = factory.createText();
		button.click();
		text.write();

	}

}
