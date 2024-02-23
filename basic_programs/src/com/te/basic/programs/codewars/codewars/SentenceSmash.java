package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SentenceSmash {
	
	//using steam
	public static String smash(String... words) {

	    return  Arrays.stream(words).collect(Collectors.joining(" ")).toString();
	  }
	

	public static void main(String[] args) {
		String[] a = {"Hello","World"};
//		String a =
		System.out.println(smash(a));
		
		
		//using String join Method
		/*
		 * String.join():  
		 * Returns a new String composed of copies of the CharSequence elements joined together with a copy 
		 * of the specified delimiter. 
       For example, 
     String message = String.join("-", "Java", "is", "cool");
     // message returned is: "Java-is-cool"
          Note that if an element is null, then "null" is added.
          Parameters:delimiter the delimiter that separates each element elements the elements to join together.   
		 */
			String join = String.join(" ", "Hallow","hello"," ");
			System.out.println(join);
			
			
		//using String Builder 	
			StringBuilder append = null;
			StringBuilder sb = new StringBuilder();
			for (String b : a) {
				 append = sb.append(b +" ");
				
			}
			append.toString().trim();
			
			System.err.println(append +" using String bUilder Method");
		
			//Using String
			String name = "";
			for(String h:a) {
				
				name +=h+ " ";
			}
			System.out.println(name);
		
	}

}
