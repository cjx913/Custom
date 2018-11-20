package com.cjx913.design_mode.creational.abstractfactory.unix;

import com.cjx913.design_mode.creational.abstractfactory.Text;

public class UnixText implements Text {


	public void write() {
		System.out.println("UnixText.write()");
	}

}
