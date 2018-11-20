package com.cjx913.design_mode.creational.abstractfactory.windows;


import com.cjx913.design_mode.creational.abstractfactory.Button;
import com.cjx913.design_mode.creational.abstractfactory.Text;
import com.cjx913.design_mode.creational.abstractfactory.UIFactory;

public class WindowsUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Text createText() {
		return new WindowsText();
	}

}
