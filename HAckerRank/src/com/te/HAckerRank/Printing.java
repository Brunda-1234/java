package com.te.HAckerRank;

import java.util.Scanner;

public class Printing {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
       double d =  scan.nextDouble();
        scan.nextLine(); // Consumes the newline character after the double input
        String s = scan.nextLine();// Reads the entire line after the double input
        /*
         * Using scan.nextLine() after reading the double value consumes the newline character 
         * left in the input stream, allowing you to correctly read the subsequent 
         * String input using scan.nextLine().
         */

       System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
