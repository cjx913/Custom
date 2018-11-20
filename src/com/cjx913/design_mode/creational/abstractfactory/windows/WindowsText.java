package com.cjx913.design_mode.creational.abstractfactory.windows;


import com.cjx913.design_mode.creational.abstractfactory.Text;

public class WindowsText implements Text {

	@Override
	public void write() {
		System.out.println("WindowsText.write()");
	}

}
