package com.te.basic.programs.codewars;

public class SumOfNUmbers {

	//one way
	public static Integer sum(int n) {
		
		int value = 0;
		for(int i =1;i<=n;i++) {
			value += i;
		}
		return value;
	}
	
	//Another way
	public static Integer add(int n) {
		 
		  int result = n*(n+1)/2;
		 return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(SumOfNUmbers.sum(5));
		
		System.err.println(sum(5));
	}
}
