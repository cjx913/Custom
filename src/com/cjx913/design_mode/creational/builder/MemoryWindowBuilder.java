package com.cjx913.design_mode.creational.builder;

public class MemoryWindowBuilder extends WindowBuilder {

	@Override
	public void buildMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildPlaylist() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildMainWindow() {
		window.setMainWindow("��ʾ������");
	}

	@Override
	public void buildControlBar() {
		window.setControlBar("��ʾ������");

	}

	@Override
	public void buildCollectionlist() {
		window.setCollectionlist("��ʾ�ղ��б�");
		
	}

}
