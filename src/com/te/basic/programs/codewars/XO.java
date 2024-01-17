package com.te.basic.programs.codewars;

/*
 * Check to see if a string has the same amount of 'x's and 'o's.
 *  The method must return a boolean and be case insensitive.
 *   The string can contain any char.
 *  
 *   
 *   Examples input/output:  
 *   
 *   XO("ooxx") => true
     XO("xooxx") => false
     XO("ooxXm") => true
     XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
     XO("zzoo") => false
 */
public class XO {

	public static boolean getXO(String str) {
        int oCount = 0;
        int xCount = 0;
		char[] c = str.toCharArray();
	    for(int i = 0;i<c.length;i++) {
	    int l =(c[i]=='o'||c[i] =='O')?oCount++:(c[i] == 'x'||c[i] == 'X')?xCount++:0;
	    }
	    if(oCount ==xCount) {
	    	  return true;
	      }
		
		return false;
	}
	
	public static boolean getOX(String str) {
//		str = str.toLowerCase();
//		return str.replaceAll("o", "").length() == str.replaceAll("x", "").length();
		
		return str.toUpperCase().replace("O", "").length() == str.toUpperCase().replace("X", "").length();
	}
	
	
	public static boolean getXo(String str) {
		long count = str.toLowerCase().chars().filter(i->i == 'o').count();
		long count2 = str.toLowerCase().chars().filter(j->j == 'x').count();
        return count ==count2;
	}
	public static void main(String[] args) {
		
		System.out.println(XO.getXO("brunda"));  //true
		System.err.println(XO.getOX("oOXxxGHIJKooasxx")); //false
		System.out.println(XO.getXo("brundaoxx0"));  //false
	}
	
}
