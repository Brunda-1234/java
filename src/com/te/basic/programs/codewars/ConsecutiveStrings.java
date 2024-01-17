package com.te.basic.programs.codewars;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveStrings {

	public static String longestConsec(String[] strarr, int k) {
		int l = 0;
		int len = 0;
		int idx = 0;
		String res = "";
		List<String> list = new ArrayList<String>();
		int n = strarr.length;
		if (n == 0 || k > n || k <= 0) {
			return "";
		}

		for (int i = 0; i <= n - k; i++) { //bcz array length less than k value at last 

			for (int j = i; j < i + k; j++) { //here i need to add the next index

				res += strarr[j];

//	    		  System.err.println(res +">>>>>>>>>>>");

			}

			list.add(res);
			res = "";
//	    	  System.out.println(list+" ???????????????");
		}
//	       for(String s : list){
//	          if(len< s.length()) {
//	            len = s.length();
//	          }   
//	       }
//	      for(String s1 : list){
//	        if(len == s1.length()){
//	          return s1;
//	        }
//	      }

		for (int j = 0; j < list.size(); j++) {

			if (len < list.get(j).length()) {
				len = list.get(j).length();
				idx = j;

			}
			
		}
		
//		System.out.println(list.get(idx));
		return list.get(idx);
	}

	public static void main(String[] args) {

		String[] arr = { "zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail" };

		System.out.println(longestConsec(arr, 2));
	}


}
