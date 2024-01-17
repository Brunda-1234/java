package com.te.basic.programs.ask.interveiw;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {

	static  String roman(int n) {
		
		String roman = "";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("M", 1000);
		map.put("CM", 900);
		map.put("D", 500);
		map.put("CD", 400);
		map.put("C", 100);
		map.put("XC", 90);
		map.put("L", 50);
		map.put("XL", 40);
		map.put("X", 10);
		map.put("IX", 9);
		map.put("V", 5);
		map.put("IV", 4);
		map.put("I", 1);
//		System.out.println(map);
		 final int[] num = {n};
		 /*
		  * this we use bcz variable inside the stream it will treat it as final
		  */
//		 return map.entrySet().stream()
//	                .filter(entry -> num[0] >= entry.getValue())                      
//	                .map(entry -> {
//	                    String s = entry.getKey();
//	                    num[0] = n- entry.getValue();
//	                    return s;
//	                })
//	                .reduce("", (result, s) -> result + s);
		 
		 
			 for (Map.Entry<String, Integer> entry : map.entrySet()) {
		            String key = entry.getKey();
		            Integer val = entry.getValue();
//		            System.out.println(key + " " +val);
		            while (n >= val) {
		                roman += key;
		                n -= val;
		            }
		            
		        }
		        return roman;
		
		
		
	}
	public static void main(String[] args) {
		
	 System.out.println(roman(90));
	}
}
