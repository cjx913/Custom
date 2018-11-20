package com.cjx913.design_mode.creational.prototype;

import java.io.Serializable;

public class Attachment implements Serializable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void download() {
		System.out.println("���ظ������ļ���Ϊ"+name);
	}

}
