package com.cjx913.design_mode.behavioral.template;

public class AllMessageDisplay extends AMessageDisplay {

	@Override
	public void display(ClientMessage clientMessage) {
		System.out.println(clientMessage.getName()+"-"+clientMessage.getGander()+"-"+clientMessage.getAge());
	}

}
