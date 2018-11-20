package com.cjx913.design_mode.behavioral.strategy;

public class LongDistanceTakeOff extends ATakeOff {

	@Override
	public void takeOff() {
		System.out.println("长距离起飞");
	}

}
