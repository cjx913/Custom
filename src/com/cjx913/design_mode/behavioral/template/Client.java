package com.cjx913.design_mode.behavioral.template;

public class Client {

	public static void main(String[] args) {
		AMessageSearch messageSearch = new IdMessageSearch();
		AMessageDisplay messageDisplay = new AllMessageDisplay();
		MessageServer messageServer = new MessageServer(messageSearch,messageDisplay);
		
		messageServer.searchAndDisplay("1");

	}

}
