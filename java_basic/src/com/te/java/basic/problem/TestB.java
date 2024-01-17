package com.te.java.basic.problem;

public class TestB implements A{

	@Override
	public String stand() {
		
		return "Come Stand Abstract Method";
	}

	public static void main(String[] args) {
		TestB b =  new TestB();
		
		System.out.println(b.stand());
		System.out.println(A.go());
		
		
	}
}
