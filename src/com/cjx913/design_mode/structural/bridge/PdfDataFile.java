package com.cjx913.design_mode.structural.bridge;

import java.io.InputStream;

public class PdfDataFile extends DataFile {

	@Override
	public void parseFile() {
		dataBse.connection();
		InputStream inputStream = dataBse.readFile(null);
		//转换的实现
		System.out.println("PDF转换成功");
	}

}
