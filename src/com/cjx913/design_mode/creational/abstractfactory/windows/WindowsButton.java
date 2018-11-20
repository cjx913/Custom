package com.cjx913.design_mode.creational.abstractfactory.windows;


import com.cjx913.design_mode.creational.abstractfactory.Button;

public class WindowsButton implements Button {

	@Override
	public void click() {
		System.out.println("WindowsButton.click()");
	}

}
