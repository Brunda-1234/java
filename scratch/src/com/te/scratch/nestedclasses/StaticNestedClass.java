package com.te.scratch.nestedclasses;

public class StaticNestedClass {
	
	int i= 10;
	static int j =20;
	
	void come() {
		System.out.println(i);
	}
	
	static int add(int a,int b) {
		int c = a+b;
		return c;
		
	}
	static class A{
		int h = 20;
	   static int z = 80;
	}
	
	public static void main(String[] args) {
		//calling the StaticNestedClass
		StaticNestedClass ex = new StaticNestedClass();
	    System.out.println(ex.i +" StaticNestedClass ");
	    System.out.println(j + "StaticNestedClass");
	    System.out.println(ex.add(20, 50) + "StatiNestedClass");
	
	    //calling nested One
	    A a = new A();
	    System.out.println(a.h + " Class A");
	    //we can call like this also
	    System.out.println(new A().z + " Class A");
	
	}

}
