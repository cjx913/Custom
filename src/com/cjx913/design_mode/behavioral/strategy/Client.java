package com.cjx913.design_mode.behavioral.strategy;

public class Client {
	public static void main(String[] args) {
		ATakeOff takeOff = new VerticalTakeOff();
		AFly fly = new SubSonicFly();
		AirPlane airPlane = new AirPlane("直升机", takeOff, fly);
		airPlane.liftOff();
	}

}
