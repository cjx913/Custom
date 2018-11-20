package com.cjx913.design_mode.structural.adapter;

public class Administrator extends User {
	private Encryption encryption;
	
	public Administrator(Encryption encryption) {
		super();
		this.encryption = encryption;
	}

	public Administrator(String password, String email,Encryption encryption) {
		super(password, email);
		this.encryption = encryption;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void passwordEncipher() {
		setPassword(encryption.encipher(this.password));
	}

	@Override
	public void emailEncipher() {
		setEmail(encryption.encipher(this.email));
	}

	@Override
	public String toString() {
		return "Administrator [encryption=" + encryption + ", password=" + password + ", email=" + email + "]";
	}
	
	

}
