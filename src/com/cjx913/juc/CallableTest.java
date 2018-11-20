package com.cjx913.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {

	public static void main(String[] args) {
		Integer integer = new Integer(100);
		MyCallable myCallable = new MyCallable();
		FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
		
		
		System.out.println("*****************");
		new Thread(futureTask).start();
		System.out.println("*****************");
		
		try {
			Integer result = futureTask.get();
			System.out.println(integer+result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("*****************");
		
		

	}

}

class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		Integer sum = 0;
		for(int i=1;i<10000;i++) {
			sum+=i;
		}
		return sum;
	}
	
}
