package com.te.java.basic.samples;

public class Jeep implements Vehicle{

	@Override
	public void go() {
//		System.out.println("First");
		System.out.println("Go inner method");
	}
	
	public static void main(String[] args) {
		
		Jeep jeep = new Jeep();
		jeep.go();
//		Car car = new Vehicle.Car();
//		car.innerClass(); if we make this static no need to create an object 
		new Car().innerClass(); //direclty call using the Car class
		

		
		
	}
	 
 }
