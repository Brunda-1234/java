package com.te.thread;

public class SynchronizedClass {
	
	int count ;
	public synchronized void increment() {
		count++;
		System.out.println(count +"--" +Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		SynchronizedClass class1 = new SynchronizedClass();
		
		Thread thread1 = new Thread(()-> {
			for(int i =0;i<10;i++) {
				class1.increment();
			}
		});
		
		Thread thread2 = new Thread(()->{
			for(int i =0;i<10;i++) {
				class1.increment();
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}catch (Exception e) {
           e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println(class1.count );
	}

}
