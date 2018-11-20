package com.cjx913.design_mode.behavioral.template;

public class NameMessageSearch extends AMessageSearch {

	@Override
	public ClientMessage search(String keyword) {
		if(keyword.equals("cjx913")) {
			return new ClientMessage("1","cjx913", "男", 23);
		}
		return null;
	}

}
