package com.te.creational;

public class SynchronizedSingleton {

	private static SynchronizedSingleton instanceSingleton;
		
		

	private SynchronizedSingleton() {
		
	}
	
	

	public static synchronized SynchronizedSingleton getInstance() {
		
		if(instanceSingleton == null) {
			instanceSingleton = new SynchronizedSingleton();
		}
		return instanceSingleton;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(SynchronizedSingleton.getInstance());
		System.out.println(SynchronizedSingleton.getInstance().hashCode());
		
		
	}
}
/*
 * com.te.creational.SynchronizedSingleton@2752f6e2
   659748578
 * 
 */
