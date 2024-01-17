package com.te.scratch.keywords;

public class VolatileExample {
	
	public boolean flag = true;
	
	public void stopThread() {
		flag  = false;
	}
	
	public void runThread() {
		while(flag) {
			System.out.println("Thread Running....");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Exception Handled:--");
			}
			
			System.out.println("Thread Stopped..");
			
		}
	}
	
	public static void main(String[] args) {
		
		VolatileExample example = new VolatileExample();
		
		
		Thread thread = new Thread(()->{
			example.runThread();
		});
		thread.start();
		try {
		thread.sleep(5000);
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		example.stopThread();
	}

}
