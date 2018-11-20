package com.cjx913.design_mode.structural.decorator;

public class Client {

	public static void main(String[] args) {
		Encryption encryption = new SimpleEncryption();
		String result = encryption.encipher("cjx913");
		System.out.println(result);
		
		encryption = new SHAEncryption(encryption);
		result = encryption.encipher("cjx913");
		System.out.println(result);
	
		

	}

}
