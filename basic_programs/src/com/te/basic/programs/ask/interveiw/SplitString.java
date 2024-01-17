package com.te.basic.programs.ask.interveiw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SplitString {
	

	    public static void main(String[] args) {
	        String input1 = "Brunda";
	        List<String> output1 = splitStringIntoPairs(input1);
	        System.out.println(output1); // Output: [Br, un, da]

	        String input2 = "Brundaa";
	        List<String> output2 = splitStringIntoPairs(input2);
	        System.out.println(output2); // Output: [Br, un, da, a_]
	    }
	    
	    

	    public static List<String> splitStringIntoPairs(String input) {
	        List<String> output = new ArrayList<>();
	    	
	        int length = input.length();

	        for (int i = 0; i < length; i += 2) {
	            if (i + 1 < length) {
	            	System.err.println(i);
	                output.add(input.substring(i, i + 2)); //(0,1) (
	                System.err.println(input.substring(i, i + 2));
	            } else {
	                // If the length is odd, add an underscore to the last character
	                output.add(input.substring(i) + "_");
	            }
	        }

	        return output;
	    }
	    


	

}
