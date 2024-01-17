package com.te.creational;

import java.io.Serializable;

public class SeralizableSingleton implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 *it will give the class version for the deserialization 
	 */

	private static SeralizableSingleton instance;
	
	public static SeralizableSingleton  getInstance() {
		
		if(instance == null) {
			
			  instance = new SeralizableSingleton();
			
		}
		return instance;
		
	}
	
	private static  Object getrecord() {
		return getInstance();
	}
	
	public static void main(String[] args) {
		
		SeralizableSingleton instance2 = SeralizableSingleton.getInstance();
	Object getrecord = SeralizableSingleton.getrecord();
	
	System.err.println(getrecord);
		System.out.println(instance2.hashCode());
		System.out.println("Deserialized  " + getrecord.hashCode());
	}

}

/*
 * com.te.creational.SeralizableSingleton@2752f6e2
     659748578
     Deserialized  659748578
 * */
