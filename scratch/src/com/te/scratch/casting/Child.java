package com.te.scratch.casting;

public class Child extends Parent {
	
	public static void method1() {
		System.out.println("Child class ");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Child();
//		Child child = new Child();
//		child.method1();
		p.method1();
	}

}
