package com.te.scratch.keywords;

class A{
	
}
public class InstanceOfExample {

	public static void main(String[] args) {
		
		A a = new A();
		if(a instanceof A) {
			System.out.println("Instance ");
		}else {
		System.out.println("Not instance");}
	}
}
