package com.te.basic.programs.codewars;

public class CountingSheep {
	
	public static String count(int num) {
		StringBuilder builder = new StringBuilder();
		for(int i = 1;i<= num;i++) {
			builder.append(i).append(" sheep...");
		}
		return builder.toString();
	}
	
	public static String counts(int num) {
		
			   
//		    String s  = String.valueOf(num);
		    String g = "";
		    for(int i = 1;i<= num;i++){
		      g =g+i+" sheep...";
		    }
		    return g;
		  
	}

	public static void main(String[] args) {
		
		System.out.println(CountingSheep.count(5));
		System.err.println(CountingSheep.counts(3));
	}
}
