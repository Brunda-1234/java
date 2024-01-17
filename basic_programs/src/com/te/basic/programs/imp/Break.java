package com.te.basic.programs.imp;

public class Break {

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
			switch(i) {
			case 0: break;
			case 1:System.out.println("One");
			case 2:System.out.println("Two");
			case 3:System.out.println("Three");
			}
		}
	}
}
/*
 * One
Two
Three
Two
Three
 */
