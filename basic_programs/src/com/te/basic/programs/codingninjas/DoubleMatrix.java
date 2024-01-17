package com.te.basic.programs.codingninjas;

import java.util.Arrays;

public class DoubleMatrix {

	public static void main(String[] args) {
		
//		System.out.println(g[0][0]);
	    String s = "af";
//	    int parseInt = Integer.parseInt(s);
//	    System.out.println(parseInt);

	    int codePointBefore = s.codePointBefore(1);
	    System.out.println(codePointBefore);
	    int codePointCount = s.codePointCount(0, s.length());
	    System.out.println(codePointCount);

	    for(int i=0;i< s.length();i++) {
	    	char charAt = s.charAt(i);
	    	System.out.println(charAt);
//	    	int 
	    int a	=(int)charAt;
	    	System.err.println(a);
	    }
           
	    
//	    int d = 10;
//	    String valueOf = String.valueOf(d);
//	    System.out.println(valueOf);
 	}
}
