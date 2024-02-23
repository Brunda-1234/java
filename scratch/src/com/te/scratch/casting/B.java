package com.te.scratch.casting;

public class B extends A {
	
	int g = 20;
	int h;
	
	public void d() {
		System.out.println("Child Class");
	}
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.g +"////");
		System.err.println(b.a +";;;;;;;;;");
		b.d();
		b.g();
		
		A a = new B(); // upcasting :--  Parent to child 
		System.err.println(a.a+"-----");
		a.g();
		
		 B bsdg = (B) a;//Downcasting :-- child to parent
		 bsdg.d();
		 bsdg.g();
		 
	}

}
