package com.cjx913.design_mode.creational.abstractfactory.linux;


import com.cjx913.design_mode.creational.abstractfactory.Button;
import com.cjx913.design_mode.creational.abstractfactory.Text;
import com.cjx913.design_mode.creational.abstractfactory.UIFactory;

public class LinuxUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public Text createText() {
		return new LinuxText();
	}

}
