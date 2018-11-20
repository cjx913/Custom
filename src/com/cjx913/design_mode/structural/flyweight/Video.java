package com.cjx913.design_mode.structural.flyweight;

public class Video extends Media {

	public Video(String name) {
		super(name);
	}

	@Override
	public void display(MediaState mediaState) {
		System.out.println("视频名字："+getName()+"\n"+
				"位置：X："+mediaState.getPositionX()+"，Y："+mediaState.getPositionY()+"\n"+
				"大小：X："+mediaState.getSizeX()+"，Y："+mediaState.getSizeY());
	}

}
