package com.cjx913.design_mode.structural.flyweight;

public class Photo extends Media {

	public Photo(String name) {
		super(name);
	}

	@Override
	public void display(MediaState mediaState) {
		System.out.println("相片名字："+getName()+"\n"+
				"位置：X："+mediaState.getPositionX()+"，Y："+mediaState.getPositionY()+"\n"+
				"大小：X："+mediaState.getSizeX()+"，Y："+mediaState.getSizeY());
	}

}
