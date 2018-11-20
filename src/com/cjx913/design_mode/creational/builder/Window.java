package com.cjx913.design_mode.creational.builder;

public class Window {
	private String menu;
	private String playlist;
	private String mainWindow;
	private String controlBar;
	private String collectionlist;
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPlaylist() {
		return playlist;
	}
	public void setPlaylist(String playlist) {
		this.playlist = playlist;
	}
	public String getMainWindow() {
		return mainWindow;
	}
	public void setMainWindow(String mainWindow) {
		this.mainWindow = mainWindow;
	}
	public String getControlBar() {
		return controlBar;
	}
	public void setControlBar(String controlBar) {
		this.controlBar = controlBar;
	}
	public String getCollectionlist() {
		return collectionlist;
	}
	public void setCollectionlist(String collectionlist) {
		this.collectionlist = collectionlist;
	}
	@Override
	public String toString() {
		return "Window [menu=" + menu + ", playlist=" + playlist + ", mainWindow=" + mainWindow + ", controlBar="
				+ controlBar + ", collectionlist=" + collectionlist + "]";
	}
	
	
	
	
	
}
