package com.cjx913.design_mode.creational.builder;

public class WholeWindowBuilder extends WindowBuilder {

	@Override
	public void buildMenu() {
		window.setMenu("��ʾ�˵�");

	}

	@Override
	public void buildPlaylist() {
		window.setPlaylist("��ʾ�����б�");

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
