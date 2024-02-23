package com.te.HAckerRank;

import java.util.Scanner;

public class JavaLoopII {

	public static void main(String []argh){
		
		Scanner sc  = new Scanner(System.in);
		int timeOcc = sc.nextInt();
		
		for(int i =0;i<timeOcc;i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int iterationSeries = sc.nextInt();
			
			int term=a;
			for(int j=0;j<iterationSeries;j++) {
				
				term += (int)Math.pow(2, j)*b;
				System.out.print(term +" ");
				
			}
			System.out.println();
		}
		sc.close();
	}
    	 

}
