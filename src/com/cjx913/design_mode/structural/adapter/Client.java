package com.cjx913.design_mode.structural.adapter;

public class Client {
	
	public static void main(String[] args) {
		Encryption encryption = new MySHAEncryption();
		User user = new Administrator("cjx913","12345678",encryption);
		user.passwordEncipher();
		user.emailEncipher();
		System.out.println(user.toString());
	}

}
