package com.te.basic.programs.codewars;

public class CountTheSheeps {
	
	static int  count(boolean[] arrayOfSheeps) {
	   
		int count = 0;
		for(int i = 0;i<arrayOfSheeps.length;i++) {
			 boolean b = arrayOfSheeps[i]; //true 0r false or null
		    boolean equals = Boolean.TRUE.equals(b);
		    if(equals) {
		    	count++;
		    }
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		boolean[] sheep = {true,true,false,true,true,false,true};
		System.out.println(count(sheep));

	}

}
