package com.te.scratch.keywords;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		
		for(int i = 0;i<=10;i++) {
			System.out.println(i);
			
			if(i==5) {
				System.out.println("Equals" + i);
				continue;
				
			}
			System.out.println("After the Continue " +i);
		}
	}
}
