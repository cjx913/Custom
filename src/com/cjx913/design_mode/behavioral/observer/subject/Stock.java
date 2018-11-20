package com.cjx913.design_mode.behavioral.observer.subject;

import java.util.Observable;

public class Stock extends Observable {
	private String name;
	private float initialPrice;
	private float currentPrice; 
	public Stock(String name ,float initialPrice) {
		this.name = name;
		this.initialPrice = initialPrice;
	}
	
	private float getRise() {
		return (currentPrice-initialPrice)/initialPrice;
	}

	public float getCurrentPrice() {
		return currentPrice;
	}
	
	public void setInitialPrice(float initialPrice) {
		this.initialPrice = initialPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getInitialPrice() {
		return initialPrice;
	}

	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
		if (getRise()>=0.05) {
			this.setChanged();
			notifyObservers(name);
		}
	}
	
	
}
