package com.te.my.programs;



public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		 // Lazy initialization: create the instance if it doesn't exist yet 
		//lazy initialization, creating the instance only if it doesn't exist yet.
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	//eager Initialization during the compile time  --- that is initialized at the time of class loading.
	public static Singleton getta() {
		return instance;
	}
	public static void main(String[] args) {
		
		Singleton instance2 = getInstance();
		Singleton instance3 = getInstance();
		
		Singleton getta = getta();
		System.err.println(getta.hashCode());
		
		
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
	}

}
