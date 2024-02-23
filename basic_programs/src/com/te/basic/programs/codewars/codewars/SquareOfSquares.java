package com.te.basic.programs.codewars;

public class SquareOfSquares {
	
	public static boolean square(int n) {
	
//		double sqrt = Math.sqrt(n); //n=26
//		System.out.println(sqrt%1); //0.09901951359278449
//		System.err.println(sqrt%1 ==0); //false
//		
//		
		return Math.sqrt(n)% 1 ==0; 
	}
	
	static boolean squares(int n) {
		int i =0;
		if(n<0) {
			System.out.println("negative numbers are not allowed");
		}
		while(i*i<n) {
			if(i*i == n) {
				return true;
			}else {
				i++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(square(25));
		System.err.println(squares(5));
	}

}
