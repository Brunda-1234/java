package com.te.HAckerRank;

import java.util.Scanner;

public class PrintingStringAndNumberinSingleLimitedCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//	    int n = sc.nextInt();
//		String sh = "";
//		int n1;
//		
//	    
//		for(int i=0;i<16;i++) {
//			if(s.length()<=16) {
//				sh +=s;
//				 
//				 int length =16-sh.length();
//				
//			}
//
//			String in = String.valueOf(n);
//			char[] ch  = in.toCharArray();
//			if(in.length() == 3) {
//				 n1 = Integer.parseInt(in);
//			}else {
//				sh = "0"+in;
//				
//				System.err.println(sh);
//			}
//			
//				
//		}
//		System.out.printf("%s---%s ",s,sh).println();
//		
//		

		
		System.out.println("================================");
		while (sc.hasNext()) {
			String s = sc.next();
			int n = sc.nextInt();

			// Format the integer to have leading zeros if less than 3 digits
			String formattedInt = String.format("%03d", n);

			// Create a 16-character string combining the input string and formatted integer
			String result = String.format("%-15s%s", s, formattedInt);

			// If the combined string is shorter than 16 characters, pad it with spaces
			if (result.length() < 18) {
				int spacesToAdd = 18 - result.length();
				result = String.format("%-" + (result.length() + spacesToAdd) + "s", result);
			}

			System.out.println(result);
		}

		sc.close();

		System.out.println("================================");

	}
}
