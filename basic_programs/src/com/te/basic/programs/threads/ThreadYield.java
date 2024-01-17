package com.te.basic.programs.threads;

public class ThreadYield  extends Thread{

	public void run() {
		for(int i = 1;i<=5;i++) {
			System.out.println(currentThread().getName() +" "+i);

		}
	}
	public static void main(String[] args) {
		
		ThreadYield threadYield = new ThreadYield();
		threadYield.start();
	Thread.yield();
		for(int i = 1;i<=5;i++) {
			System.out.println(currentThread().getName() +" "+i);
		}
	}
	

}
