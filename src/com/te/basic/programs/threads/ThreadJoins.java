package com.te.basic.programs.threads;

public class ThreadJoins extends Thread {

	 static Thread mainThread;

	 public  void run() {
		
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for(int i = 0;i<5;i++) {
			System.out.println("Child Thread 1...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * to make child thread to be wait until the main method to complete its task
		 * we can call the join method on main thread reference 
		 *  
		 *  it telling to the main thread like
		 *          --- after completing ur task join to child thread
		 */
		
	mainThread = Thread.currentThread();
		
	ThreadJoins joins = new ThreadJoins();
	joins.start();
		
	/*
	 * here main thread will wait until the child thread to completes its task	
	 * bcz we are calling the join method on reference of child thread
	 */
//		joins.join();
		/*
		 * Waits for this thread to die. 
         An invocation of this method behaves in exactly the same way as the invocation 

           join(0) 
            Throws:InterruptedException - if any thread has interrupted the current thread. 
            The interrupted status of the current thread is cleared when this exception is thrown.
		 */
		
		for(int i = 0;i<5;i++) {
			System.err.println("Main Thread 1...");
			Thread.sleep(1000);
		}
	}
}

/*output
 *  
 * Main Thread 1...
Main Thread 1...
Main Thread 1...
Main Thread 1...
Main Thread 1...
Child Thread 1...
Child Thread 1...
Child Thread 1...
Child Thread 1...
Child Thread 1...

*/
