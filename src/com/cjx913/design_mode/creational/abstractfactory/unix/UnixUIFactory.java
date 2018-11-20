package com.cjx913.design_mode.creational.abstractfactory.unix;

import com.cjx913.design_mode.creational.abstractfactory.Button;
import com.cjx913.design_mode.creational.abstractfactory.Text;
import com.cjx913.design_mode.creational.abstractfactory.UIFactory;

public class UnixUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new UnixButton();
	}

	@Override
	public Text createText() {
		return new UnixText();
	}

}
