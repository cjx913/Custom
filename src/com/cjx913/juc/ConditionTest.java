package com.cjx913.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
	public static void main(String[] args) {
		Alternate alternate = new Alternate();
		Thread thread1 = new Thread(new MyThreadA(alternate), "thread1");
		Thread thread2 = new Thread(new MyThreadB(alternate), "thread2");
		Thread thread3 = new Thread(new MyThreadC(alternate), "thread3");

		thread1.start();
		thread2.start();
		thread3.start();
	}

}

class MyThreadA implements Runnable {
	private Alternate alternate;

	public MyThreadA(Alternate alternate) {
		this.alternate = alternate;
	}

	@Override
	public void run() {
		alternate.printA();
	}
}

class MyThreadB implements Runnable {
	private Alternate alternate;

	public MyThreadB(Alternate alternate) {
		this.alternate = alternate;
	}

	@Override
	public void run() {
		alternate.printB();
	}
}

class MyThreadC implements Runnable {
	private Alternate alternate;

	public MyThreadC(Alternate alternate) {
		this.alternate = alternate;
	}

	@Override
	public void run() {
		alternate.printC();
	}
}

class Alternate {
	private int flag = 1;
	private Lock lock = new ReentrantLock();
	private Condition condition1 = lock.newCondition();
	private Condition condition2 = lock.newCondition();
	private Condition condition3 = lock.newCondition();

	public void printA() {
		lock.lock();
		try {
			if (flag != 1) {
				condition1.await();
			}
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + ":A");
			}
			flag = 2;
			condition2.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void printB() {
		lock.lock();
		try {
			if (flag != 2) {
				condition2.await();
			}
			for (int i = 1; i <= 15; i++) {
				System.out.println(Thread.currentThread().getName() + ":B");
			}
			flag = 3;
			condition3.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void printC() {
		lock.lock();
		try {
			if (flag != 3) {
				condition3.await();
			}
			for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + ":C");
			}
			System.out.println("**********************************");
			flag = 1;
			condition1.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
