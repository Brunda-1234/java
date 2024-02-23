package com.te.my.programs;

import java.util.Arrays;

public class ShiftZerosToLeft {
	
	public static void main(String[] args) {
		
		int[] a = {2, 5, 0, 3, 0, 2, 0, 6};
		int count = a.length-1;
		int[] res = new int[a.length];
		
//		for(int i=0;i<a.length;i++) {
//			
//			if(a[i] != 0){
//				
//			
//				res[count] = a[i];
//				count++;
//				
//			}
//		
//		}
		for(int k=a.length-1;k>=0;k--) {
		
			if(a[k]!=0) {
				res[count] =a[k];
				count--;
			}
		}
		
		System.out.println(Arrays.toString(res));
	
	}

}
