package com.te.basic.programs.codewars;

import java.util.Arrays;

public class ConvertStringToArray {
	
	  public static String[] stringToArray(String s) {
	
		return s.split(" ");
	       
	    }
	  
	  public static void main(String[] args) {
		
		  System.out.println(Arrays.toString(ConvertStringToArray.stringToArray("Brunda Sahukar V")) );
	}


}
