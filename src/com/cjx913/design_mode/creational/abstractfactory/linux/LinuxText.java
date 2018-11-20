package com.cjx913.design_mode.creational.abstractfactory.linux;


import com.cjx913.design_mode.creational.abstractfactory.Text;

public class LinuxText implements Text {

	@Override
	public void write() {
		System.out.println("LinuxText.write()");
	}

}
