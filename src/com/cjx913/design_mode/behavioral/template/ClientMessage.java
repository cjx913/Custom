package com.cjx913.design_mode.behavioral.template;

public class ClientMessage {
	private String id;
	private String name;
	private String gander;
	private int age;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ClientMessage(String id,String name, String gander, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gander = gander;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGander() {
		return gander;
	}

	public void setGander(String gander) {
		this.gander = gander;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	

}
