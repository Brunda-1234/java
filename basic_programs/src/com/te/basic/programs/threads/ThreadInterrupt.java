package com.te.basic.programs.threads;

public class ThreadInterrupt extends Thread {

	public  void run() {
		
       try {
    	   for(int  i= 0;i<5;i++) {
    		   System.out.println("Child Thread ....");
    		   Thread.sleep(1000);
    		   
    	   }
		
	} catch (Exception e) {
		System.out.println("Thread Inetrrupted" +e);
	
	}	
	}
	
	public static void main(String[] args) {
		
		ThreadInterrupt interruptThread = new ThreadInterrupt();
		interruptThread.start();
		interruptThread.interrupt();
		
		/*
		 * If the thread not in sleep mode 
		 *    the interrupt method won't effect the thread
		 * 
		 */
	}
	

}
