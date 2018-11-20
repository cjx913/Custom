package com.cjx913.juc;

import java.util.concurrent.CountDownLatch;

public class CountDownlatchTest {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(10);
		LatchDemo target = new LatchDemo(latch);
		
		long start = System.currentTimeMillis();
		
		for(int i=1;i<=10;i++) {
			new Thread(target,"thread"+i).start();
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getName()+":"+(end-start));
		System.out.println("*******************");

	}

}

class LatchDemo implements Runnable{
	private CountDownLatch countDownLatch;
	
	public LatchDemo(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(100);
			for(int i=0;i<=50000;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			countDownLatch.countDown();
		}
		
	}
	
}
