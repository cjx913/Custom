package com.cjx913.design_mode.behavioral.strategy;

public class AirPlane {
	private String name;
	private ATakeOff takeOff;
	private AFly fly;
	public AirPlane(String name) {
		this.name = name;
	}
	public AirPlane(String name,ATakeOff takeOff,AFly fly) {
		this.name = name;
		this.takeOff = takeOff;
		this.fly = fly;
	}
	public ATakeOff getTakeOff() {
		return takeOff;
	}
	public void setTakeOff(ATakeOff takeOff) {
		this.takeOff = takeOff;
	}
	public AFly getFly() {
		return fly;
	}
	public void setFly(AFly fly) {
		this.fly = fly;
	}
	
	public void liftOff() {	
		System.out.println(this.name+"正在");
		this.takeOff.takeOff();
		this.fly.fly();
	}
}
