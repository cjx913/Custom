package com.cjx913.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.LookAndFeel;

public class ProductorAndConsumer {
	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		Productor productor = new Productor(clerk);
		Consumer consumer = new Consumer(clerk);

		Thread threadProductor = new Thread(productor, "productor");
		Thread threadConsumer = new Thread(consumer, "consumer");
		threadProductor.start();
		threadConsumer.start();
	}
}

class Clerk {
	private int product = 0;
	
	Lock lock = new ReentrantLock(true);
	Condition condition = lock.newCondition();  
	public void get() {
		try {
			lock.lock();
			if (product >= 10) {
				System.out.println("����������");
				condition.await();
			}
			System.out.println("��õ�" + (++product) + "����");
			condition.signalAll();
		} catch (Exception e) {
			
		}finally {
			lock.unlock();
		}
	}
	
	public void sale() {
		try {
			lock.lock();
			if (product <= 0) {
				System.out.println("���������꣡");
				condition.wait();
			}
			System.out.println("������" + (product--) + "����");
			condition.signalAll();
		} catch (Exception e) {
			
		}finally {
			lock.unlock();
		}
	}

	/*public synchronized void get() throws InterruptedException {
		if (product >= 10) {
			System.out.println("����������");
			this.wait();
		}
		System.out.println("��õ�" + (++product) + "����");
		this.notifyAll();
	}*/

	/*public synchronized void sale() throws InterruptedException {
		if (product <= 0) {
			System.out.println("���������꣡");
			this.wait();
		}
		System.out.println("������" + (--product) + "����");
		this.notifyAll();
	}*/
}

class Productor implements Runnable {

	private Clerk clerk;

	public Productor(Clerk clerk) {
		this.clerk = clerk;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			clerk.get();
		}
	}
}

class Consumer implements Runnable {

	private Clerk clerk;

	public Consumer(Clerk clerk) {
		this.clerk = clerk;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			clerk.sale();
		}
	}

}