package com.te.basic.programs.codewars;

import java.util.Arrays;

public class FakeBinary {
	
	public static String fakeBin(String numberString) {
	      String s = "" ;
	      char[] c = numberString.toCharArray();
	      System.err.println(Arrays.toString(c));
	      for(int i = 0;i< c.length ;i++){
	        char ch = numberString.charAt(i);
	        System.err.println(ch);
	        if(ch <'5'){
	        
	         s = s+"0";
	        
	        }else {
	        s+="1";
	        System.out.println(s);
	        }
	      }
	        return s;
	    }
	
	 
	
	public static String fakeBinaryss(String numberString) {
		return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
		}
			
	
	public static void main(String[] args) {
		
		System.out.println(FakeBinary.fakeBin("859623145"));
		System.err.println(FakeBinary.fakeBinaryss("25638491258"));
	}

}
