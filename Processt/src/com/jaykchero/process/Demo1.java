package com.jaykchero.process;

public class Demo1 {
		public static void main(String[] args) {
			
			test1();
			
		}

		private static void test1() {
			
			ThreadTest test=new ThreadTest();
			
			test.start();
			
			
			for(int i=0;i<10000;i++) {
				
				System.out.println(i);
				
			}
			
		}
	
	
		static class ThreadTest extends Thread{

			@Override
			public void run() {
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				for(int i=0;i<10000;i++) {
					
					System.out.println("Ïß³Ì£º"+i);
					
				}
			}
			
			
			
			
		}
		
		
	
	
}
