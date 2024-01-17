package com.te.basic.programs.numericals;

class A{
	public static void task() {
		System.out.println("Class A");
	}
}

class B extends A{
	public static void task() {
		System.out.println("Class B");
	}
}

class C extends A{
	public static void task() {
		System.out.println("Class C");
	}
}
public class AllowMe {
	
	public static void main(String[] args) {
		
		B b = new B();
		b.task();
//	

		
		
	}
}
