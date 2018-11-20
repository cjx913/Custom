package com.cjx913.design_mode.creational.builder;

public class WindowController {
	public static final Window construct(WindowBuilder builder) {
		Window window;
		builder.buildMenu();
		builder.buildPlaylist();
		builder.buildMainWindow();
		builder.buildControlBar();
		builder.buildCollectionlist();
		window = builder.createWindow();
		return window;
	}
}
