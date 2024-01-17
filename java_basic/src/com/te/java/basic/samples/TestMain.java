package com.te.java.basic.samples;

//final class Parent{
class Parent{
	
	public void show() {
		System.out.println("Inside Parent Class");
	}
	/*
	 * Final class can't be overrided
	 * 
	 * if we try to override it will cause compilation error*/
}
class Child extends Parent{
	
	public void show() {
		System.out.println("Inside Child Class");
	}
}
public class TestMain {
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.show();
	}

}
