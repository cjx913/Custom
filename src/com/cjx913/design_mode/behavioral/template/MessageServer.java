package com.cjx913.design_mode.behavioral.template;

public class MessageServer {
	private AMessageSearch messageSearch;
	private AMessageDisplay messageDisplay;
	
	
	
	public MessageServer(AMessageSearch messageSearch, AMessageDisplay messageDisplay) {
		super();
		this.messageSearch = messageSearch;
		this.messageDisplay = messageDisplay;
	}

	public AMessageSearch getMessageSearch() {
		return messageSearch;
	}

	public void setMessageSearch(AMessageSearch messageSearch) {
		this.messageSearch = messageSearch;
	}

	public AMessageDisplay getMessageDisplay() {
		return messageDisplay;
	}

	public void setMessageDisplay(AMessageDisplay messageDisplay) {
		this.messageDisplay = messageDisplay;
	}

	public void searchAndDisplay(String keyword) {
		// 1、验证关键字
		String key = checkedKeyword(keyword);
		// 2、根据条件进行查询
		if (key == null) {
			System.out.println("关键字不能为空");
			return;
		}
		ClientMessage clientMessage = messageSearch.search(key);
		// 3、显示结果
		if (clientMessage == null) {
			System.out.println("查找无结果");
			return;
		}
		messageDisplay.display(clientMessage);
	}

	private String checkedKeyword(String keyword) {
		if (keyword != null && !keyword.isEmpty()) {
			return keyword.trim();
		}
		return null;
	}
}
