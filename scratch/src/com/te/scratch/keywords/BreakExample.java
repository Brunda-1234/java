package com.te.scratch.keywords;

public class BreakExample {
	
	public static void main(String[] args) {
		
		for(int i= 0;i<=10;i++) {
			System.out.println("In Loop");
			if(i==5) {
				System.out.println("Condition");
				break;
				
			}
			System.out.println("After Break Statement");
		}
	}

}
