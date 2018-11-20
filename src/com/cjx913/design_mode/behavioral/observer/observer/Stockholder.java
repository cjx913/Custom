package com.cjx913.design_mode.behavioral.observer.observer;

import com.cjx913.design_mode.behavioral.observer.subject.Stock;

import java.util.Observable;



public class Stockholder implements StockObserver {
	
	private String name;

	public Stockholder(String name) {
		this.name = name;
	}
	
	public void buyingStock(Stock stock) {
		stock.addObserver(this);
		System.out.println(name+"以"+stock.getCurrentPrice()+"元买了股票"+stock.getName());
	}
	
	@Override
	public void update(Observable o, Object arg) {
		String stockName = (String) arg;
		System.out.println("通知"+name+"，"+stockName+"的股价涨幅达到5%或以上");
	}
}
