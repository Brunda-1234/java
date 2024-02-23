package com.te.basic.programs.codewars;

public class GrassHopperGradeBook {
	
	public static char getGrade(int s1, int s2, int s3) {

       int avg = (s1+s2+s3)/3;
	     
	      return (90<=avg && avg<=100)?'A'
	    		  :(80<=avg && avg<90)?'B':(70<=avg && avg<80)?'C'
	    				  :(60<=avg && avg<70)?'D':(0<=avg && avg<60)?'F':'\u0000';
	      
	    }
	
	public static char grade(int s1,int s2,int s3) {
		int avg = (s1+s2+s3)/3;
		return (avg>=90)?'A':(avg>=80)?'B':(avg>=70)?'C':(avg>=60)?'D':'F';
	}
	
	public static void main(String[] args) {
		
		System.out.println(GrassHopperGradeBook.getGrade(90, 95, 93));
		System.err.println(GrassHopperGradeBook.grade(80, 70, 60));
	}

}
