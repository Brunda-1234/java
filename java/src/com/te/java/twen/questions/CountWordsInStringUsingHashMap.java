package com.te.java.twen.questions;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordsInStringUsingHashMap {

	public static HashMap<String,Integer> count(String s){
          
         
          String[] split = s.split(" ");
          HashMap<String,Integer> map = new HashMap<String,Integer>();
          for(int i = 0;i<split.length;i++){
            if(map.containsKey(split[i])){
                   Integer count = map.get(split[i]);
                   System.out.println(count);
                   map.put(split[i], count+1);
             }else{
               map.put(split[i],1);
             }
          

         } 
          return map;
	}
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		String nextLine = sc.nextLine();
		sc.close();
		
		System.out.println(count(nextLine));
	}
}
