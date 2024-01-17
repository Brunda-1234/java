package com.te.basic.programs.imp;

public class PrimeNumber {
	static boolean prime(int n ) {
	
		if(n==0||n==1) {
			return false;
		}
		for(int i = 2;i<n;i++) {
			if(n%i ==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(prime(6));
	}

}
