package com.cjx913.design_mode.creational.prototype;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		OfficialDocumentPrototyprManager documentPrototyprManager = OfficialDocumentPrototyprManager.getInstance();
		try {
			OfficialDocument document = documentPrototyprManager.get(OfficialDocumentPrototyprManager.TEMPLATE_ONE);
			System.out.println(document.getTitle());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
