package com.te.basic.programs.codewars;

import java.util.Arrays;

public class GettingAverage {
	/*
	 * There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.
You receive an array with your peers' test scores. Now calculate the average and compare your score!
Return True if you're better, else False!
Note:
Your points are not included in the array of your class's points. 
For calculating the average point you may add your point to the given array!

	 */
	public static boolean averageCount(int[] classPoints,int yourPoints) {
		
		int sum = 0;
		int average = 0;
		for(int i :classPoints) {
			sum+=i;
		}
		average = sum/classPoints.length;
		
		if(yourPoints > average) {
			return true;
		}
		return false;
	}
	
	public static boolean average(int[] classPoint,int yourPoints) {
		
		return Arrays.stream(classPoint).average().orElse(0)< yourPoints;
	}

	public static void main(String[] args) {
		int[] z = {100,200};
		int[] c = {10,9,4,5,6,7};
		System.out.println(GettingAverage.averageCount(z,9));
		System.err.println(GettingAverage.average(c, 8));
	}
}
