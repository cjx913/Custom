package com.cjx913.design_mode.creational.abstractfactory.linux;

import com.cjx913.design_mode.creational.abstractfactory.Button;

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("LinuxButton.click()");
	}

}
