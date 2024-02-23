package com.te.basic.programs.codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mumbling {


	    public static void main(String[] args) {
	        String input = "ZpglnRxqenU";
	        String output = repeatCharacters(input);

	        System.out.println(output);
	        
	        System.out.println(accum(input));
	    }

	    public static String repeatCharacters(String input) {
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            System.err.println(currentChar);
	            int repeatCount = i + 1; // The repeat count is based on the character's position

	            for (int j = 0; j < repeatCount; j++) {
	            	
	            	if(j==0) {
	            		result.append(Character.toUpperCase(currentChar));
	            	}else {
	            		result.append(Character.toLowerCase(currentChar));
	            	}
	                
	            }

	            if (i < input.length() - 1) {
	                result.append("-"); // Add a hyphen between characters
	            }
	        }

	        return result.toString();
	    
	}
	    
	    public static String accum(String h) {
	    	var split = h.split("");
	    	
	    	return IntStream
	    			.range(0, split.length) //return stream of numbers from o to split.length
	    			.mapToObj(i->split[i].toUpperCase()+split[i].toLowerCase().repeat(i))
	    			//this take the each char at that value and convert to uppercase and convert to lowerCase 
	    			//then repeat for i times 
	    			.collect(Collectors.joining("-"));
	    	//this convert the Stream(String) using the joining method
	    			
	    			
	    }

}
