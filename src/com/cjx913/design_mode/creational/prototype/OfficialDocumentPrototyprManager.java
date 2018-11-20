package com.cjx913.design_mode.creational.prototype;

import java.io.IOException;
import java.io.OptionalDataException;
import java.util.HashMap;

public class OfficialDocumentPrototyprManager {
	private volatile static OfficialDocumentPrototyprManager MANAGER = null;
	public static final String TEMPLATE_ONE = "template_one";
	public static final String TEMPLATE_TWO = "template_two";
	private HashMap<String, OfficialDocument> prototypes = new HashMap<>();

	private OfficialDocumentPrototyprManager() {
		prototypes.put(TEMPLATE_ONE, templateOne());
		prototypes.put(TEMPLATE_TWO, templateTwo());
	}

	public static OfficialDocumentPrototyprManager getInstance() {
		if (MANAGER == null) {
			synchronized (OfficialDocumentPrototyprManager.class) {
				if (MANAGER == null) {
					MANAGER = new OfficialDocumentPrototyprManager();
				}
			}
		}
		return MANAGER;
	}

	public OfficialDocument get(String key) throws OptionalDataException, ClassNotFoundException, IOException {
		OfficialDocument clone = null;
		clone = prototypes.get(key).deepClone();
		return clone;
	}

	private static OfficialDocument templateOne() {
		OfficialDocument document = new OfficialDocument();
		document.setTitle("TemplateOne");
		return document;
	}

	private static OfficialDocument templateTwo() {
		OfficialDocument document = new OfficialDocument();
		document.setTitle("TemplateTwo");
		return document;
	}

}
