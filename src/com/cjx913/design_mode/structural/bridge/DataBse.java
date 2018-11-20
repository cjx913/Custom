package com.cjx913.design_mode.structural.bridge;

import java.io.InputStream;

public interface DataBse {
	void connection();
	InputStream readFile(String fileName);
}
