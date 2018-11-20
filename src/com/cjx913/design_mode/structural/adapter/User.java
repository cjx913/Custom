package com.cjx913.design_mode.structural.adapter;

public abstract class User {

	protected String password;
	protected String email;
	
	public User() {}
	
	public User(String password, String email) {
		super();
		this.password = password;
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract void passwordEncipher();
	public abstract void emailEncipher();

}
