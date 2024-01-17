package com.te.HAckerRank;

import java.util.Scanner;

public class Solutiosdf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int spaceLength = 18;
		String res = "";
		String intV = "";
		System.out.println("==============================");
		while(sc.hasNext()) {
		String s = sc.next();
		int n = sc.nextInt();
		
		

       //to get the length of the int value
		String intValue = String.valueOf(n);
		int length = intValue.length();
		
		//compare both lengths
		res +=s;
	    
		 if(length==3) {
			 intV += intValue;	
			 spaceLength =spaceLength- (s.length()+intV.length());
			
	       }else if(length <3) {
	    	   intV +="0"+intValue;
	    	   spaceLength =spaceLength- (s.length()+intV.length());
	    	  
	       }
		 for(int j=0;j<spaceLength;j++) {
			 
				res += " ";
			}
		 res +=intV;
		 
		 System.out.println(res);
		
		
	
	   
	    
		
	/*    
	                Scanner sc=new Scanner(System.in);
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
	                            result = String.format("%-" + (result.length()  + spacesToAdd) + "s", result);
	                        }

	                        System.out.println(result);
	                    }

	                    sc.close();

	                System.out.println("================================");

	*/
		}
		sc.close();
		System.out.println("===================================");
	
	}

}
