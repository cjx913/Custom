package com.cjx913.design_mode.behavioral.observer;

import com.cjx913.design_mode.behavioral.observer.observer.Stockholder;
import com.cjx913.design_mode.behavioral.observer.subject.Stock;

public class client {
	public static void main(String[] args) throws InterruptedException {
		Stock stock = new Stock("股票A", 22f);
		Stockholder stockholder1 = new Stockholder("股民A");
		Stockholder stockholder2 = new Stockholder("股民B");
		stock.setCurrentPrice(24f);
		stockholder1.buyingStock(stock);
		stockholder2.buyingStock(stock);
		
//		stock.setCurrentPrice(24f);
		for(float i=23f;i<27f;i++) {
			stock.setCurrentPrice(i);
			System.out.println("当前股票价格："+stock.getCurrentPrice()+"元");
			Thread.sleep(1000);
		}
	}
}
