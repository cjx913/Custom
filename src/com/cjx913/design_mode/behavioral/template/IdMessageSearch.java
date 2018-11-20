package com.cjx913.design_mode.behavioral.template;

public class IdMessageSearch extends AMessageSearch {

	@Override
	public ClientMessage search(String keyword) {
		if(keyword.equals("1")) {
			return new ClientMessage("1","cjx913", "男", 23);
		}
		return null;
	}

}
