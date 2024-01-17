package com.te.basic.programs.codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountingDuplicatesString {

	public static int duplicateCount(String n) {
	  Map<Character, Integer> map = new HashMap<Character, Integer>();
	  String text = n.toLowerCase();
	  int[] count = new int[128];
	  int result=0;
	  
	  for(int i = 0;i<text.length();i++) {
		  char c = text.charAt(i);
		  count[c]++;
		  for(int j = 0;j< count.length ;j++) {
			  if(count[j] != 0) {
				  map.put((char)j, count[j]);
			  }
		  }
	  }
	  for (Entry<Character, Integer> entry : map.entrySet()) {
          Character key = entry.getKey();
          Integer value = entry.getValue();
//          System.out.println("Key: " + key + ", Value: " + value);
          if(value > 1) {
        	  result =result+1;
          }else {
        	  result = result+0;
          }
      }

	 return result;
	}
	
	
	public static int countDuplicate(String text) {
		  int ans = 0;
		    text = text.toLowerCase();
		    while (text.length() > 0) {
		      String firstLetter = text.substring(0,1);
		      text = text.substring(1);
		      if (text.contains(firstLetter)) ans ++;
		      text = text.replace(firstLetter, "");
		    }
		    return ans;
	}

	public static void main(String[] args) {
		
		System.out.println(duplicateCount("abcddffaahhggg"));
		System.out.println(countDuplicate("aaasdfdvvvbb"));
	}
	
}
