package com.te.basic.programs.threads;

public class InetrrupTest extends Thread {
	
	public void run() {
		
		System.out.println(Thread.interrupted()); //true
		System.out.println(Thread.interrupted()); //false
//		System.out.println(Thread.currentThread().isInterrupted());
//		System.out.println(Thread.currentThread().isInterrupted());
		
		
			try {
				
				for(int i = 0;i<5;i++) {
					
					System.out.println("Child Thread...." +i);
					Thread.sleep(1000);
					System.out.println(Thread.interrupted()); 
//					System.out.println(Thread.currentThread().isInterrupted()); //true
					
				}
				
			} catch (InterruptedException e) {
				
				System.out.println("Thread Interrupted ...." +e);
			}
			
		}
	
	
	public static void main(String[] args) {
		
		InetrrupTest test = new InetrrupTest();
		test.start();
		test.interrupt();
	}

}
