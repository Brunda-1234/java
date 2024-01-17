package com.te.basic.programs.threads;

public class ChildThreadWait extends Thread {

	static  Thread mainThread ;
	
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0;i<5;i++) {
			System.out.println("ChildThread ....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 * to make the child thread to wait until main thread will complete its task
		 */
		
		 mainThread = Thread.currentThread();
		 
		ChildThreadWait threadWait = new ChildThreadWait();
		threadWait.start();
		
		for(int i = 0;i<5;i++) {
			System.err.println("Main thread ....");
			Thread.sleep(1000);
		}
	}
}

