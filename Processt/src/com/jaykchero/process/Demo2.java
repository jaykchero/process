package com.jaykchero.process;

import com.jaykchero.process.Demo1.ThreadTest;

public class Demo2 {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		RunnableTest runnableTest=new RunnableTest();
		Thread thread=new Thread(runnableTest);
		thread.start();
		
		
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i <101000; i++) {
			System.out.println(i);
		}
		
		
	}
	
	
	static class RunnableTest implements Runnable{

		@Override
		public void run() {
			for (int i = 0; i <101000; i++) {
				System.out.println("Ïß³Ì£º£º"+i);
			}
			
		}
		
		
		
		
	} 
	
	
	
}
