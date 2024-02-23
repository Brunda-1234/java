package com.te.basic.programs.codewars;

import java.util.Arrays;

public class Dinglemouse {

	public static int[] humanYearsCatYearsDogYears(final int humanYears) {

		int catYears = 15;
		int dogYears = 15;
		
		if (humanYears == 2) {
			catYears += 9;
			dogYears += 9;
		}
		if (humanYears > 2) {
			catYears = 15+9;
			dogYears =15+9;
		
		for (int i = 0; i < humanYears-2; i++) {
			
			catYears += 4;
			dogYears += 5;
		}
		}
		return new int[] { humanYears, catYears, dogYears};
	}
	
	public static int[] humanYearsCatYearsDogYears1(final int humanYears) {

		int catYears = 0;
		int dogYears = 0;
		
		if (humanYears >= 1) {
			catYears += 15;
			dogYears += 15;
		}
		if (humanYears >= 2) {
			catYears +=9;
			dogYears +=9;
		
		if(humanYears >2) {
			catYears = 4*(humanYears-2);
			dogYears = 5*(humanYears -2);
		}
		}
		return new int[] { humanYears, catYears, dogYears};
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
		System.err.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
	}
}