package com.te.creational;

public class RealTimeExample {

	private static RealTimeExample example;
	
	private int a;
	private String s ;
	
	private RealTimeExample() {
		this.a = 10;
		this.s = "Cristiano Ronaldo";
	}
	
	//lazy initialization 
	private static RealTimeExample getInstance() {
		if(example == null) {
			example = new RealTimeExample();
		}
		return example;
	}
	
	
	@Override
	public String toString() {
		return "RealTimeExample [a=" + a + ", s=" + s + "]";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		
		RealTimeExample instance = RealTimeExample.getInstance();
		System.out.println(instance.a);
		System.out.println(instance.s);
	}
}
