package com.cjx913.design_mode.creational.builder;

public abstract class WindowBuilder {
	protected Window window = new Window();
	
	public abstract void buildMenu();
	public abstract void buildPlaylist();
	public abstract void buildMainWindow();
	public abstract void buildControlBar();
	public abstract void buildCollectionlist();
	
	public Window createWindow() {
		return this.window;
	}
}
