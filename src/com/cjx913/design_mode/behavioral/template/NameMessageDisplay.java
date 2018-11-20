package com.cjx913.design_mode.behavioral.template;

public class NameMessageDisplay extends AMessageDisplay {

	@Override
	public void display(ClientMessage clientMessage) {
		System.out.println(clientMessage.getName());
	}

}
