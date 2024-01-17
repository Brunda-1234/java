package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLowest {

	public static String highAndLow(String s) {
		
		String[] split = s.split(" ");
		int highest=Integer.valueOf(split[0]);
		System.err.println(highest);//9
		int lowest=Integer.valueOf(split[0]);
		System.err.println(lowest);//9
		String ok="";
		for(int i=0;i<split.length;i++) {
			if(highest<Integer.valueOf(split[i])) {
				highest=Integer.valueOf(split[i]);
				System.out.println(highest);
			}
			if(lowest>Integer.valueOf(split[i])) {
				 lowest=Integer.valueOf(split[i]);
				 System.out.println(lowest);
			}
		}

	    return ok+highest+" "+lowest; 
	}
	
	public static String HIAndLO(String s) {
		IntSummaryStatistics summaryStatistics = Arrays.stream(s.split(" "))
				                                .mapToInt(Integer::parseInt)
				                                .summaryStatistics();
		return summaryStatistics.getMax() +" " +summaryStatistics.getMin();
		
	}
	
	public static String hAndl(String s) {
		List<Integer> collect = Arrays.stream(s.split(" "))
		               .map(Integer::parseInt)
		               .collect(Collectors.toList());
		return "%s %s".formatted(Collections.max(collect),Collections.min(collect));
	}
	
	public static void main(String[] args) {
		
		System.out.println(HighestAndLowest.highAndLow("9 8 4 -5 6 2 11"));
		System.err.println(HIAndLO("-2 4 -6 8 1 9"));
		System.out.println(hAndl("-8 6 7 -3 -7 12 6 8"));
	}
}
