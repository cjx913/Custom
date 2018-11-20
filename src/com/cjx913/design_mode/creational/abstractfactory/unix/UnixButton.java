package com.cjx913.design_mode.creational.abstractfactory.unix;


import com.cjx913.design_mode.creational.abstractfactory.Button;

public class UnixButton implements Button {

	@Override
	public void click() {
		System.out.println("UnixButton.click()");
	}

}
