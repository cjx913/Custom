package com.cjx913.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	public static void main(String[] args) {
		
		Ticket ticket = new Ticket();
		Thread thread1 = new Thread(ticket, "thread1");
		Thread thread2 = new Thread(ticket, "thread2");
		Thread thread3 = new Thread(ticket, "thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class Ticket implements Runnable{
	private int ticket = 100;
	private Lock lock = new ReentrantLock();
	


	@Override
	public void run() {
		
		while(true) {
			lock.lock();
			try {
				if(ticket>0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":"+ticket--);
				}
			} finally {
				lock.unlock();
			}
			
		}
	}
	
}
