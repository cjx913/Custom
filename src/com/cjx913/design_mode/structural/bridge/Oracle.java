package com.cjx913.design_mode.structural.bridge;

import java.io.InputStream;

public class Oracle implements DataBse {

	@Override
	public void connection() {
		System.out.println("Oracle数据库已连接");
	}

	@Override
	public InputStream readFile(String fileName) {
		System.out.println(fileName);
		return null;
	}

}
