package com.te.basic.programs.codewars;



import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DecreaseOrder {
	
	 public static int sortDesc(final int num) {
		 
		 String s = Integer.toString(num);
		 char[] c = s.toCharArray();
		 
		 Arrays.sort(c);
		StringBuilder reverse = new StringBuilder(new String(c)).reverse();
		return Integer.parseInt(reverse.toString());
		 
		 
		  }
	 
	 public static int desc(int num) {
		 return Integer.parseInt(String.valueOf(num)
				 .chars()
				 .mapToObj(i->String.valueOf(Character.getNumericValue(i)))
				 .sorted(Comparator.reverseOrder())
				 .collect(Collectors.joining())
				 );
	 }
	 
	 public static void main(String[] args) {
		
		 System.out.println(DecreaseOrder.sortDesc(85213895));
		 System.err.println(DecreaseOrder.desc(58623145));
	}

}
