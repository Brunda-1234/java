package com.te.basic.programs.codewars;

public class PrinterError {

	public static String printerError(String s) {
	    int errorCount = 0;
	    int totalCharacters = s.length();

	    // Iterate through the characters in the string
	    for (int i = 0; i < totalCharacters; i++) {
	        char currentChar = s.charAt(i);

	        // Check if the character is not in the range 'a' to 'm'
	        if (currentChar < 'a' || currentChar > 'm') {
	            errorCount++;
	        }
	    }

	    // Construct the error rate as a string in the form "numerator/denominator"
	    String errorRate = errorCount + "/" + totalCharacters;

	    return errorRate;
	}
	
	public static String error(String s) {
		
		int errorCount = 0; //to count the error
		int totalCount = s.length();
		
		char[] c = s.toCharArray();
		for(int i = 0; i< c.length ;i++) {
			char ch = s.charAt(i);
			
			if(ch<'a' || ch >'m') {
				errorCount++;
			}
		}
		String sh = errorCount + "/" +totalCount;
		return sh;
	}

	public static String errr(String s) {
		return s.chars().filter(i->i>'m').count() + "/" +s.length();
	}
	public static void main(String[] args) {
		String controlString = "aaaxbbbbyyhwawiwjjjwwm";  // Error rate: "8/22"
		String s = "aaabbbbhaijjjm";   //Error rate: 0/14
		String errorRate = printerError(s);
		System.err.println(error("sgdfsfffqaaaaaaaaaaaaaaazabbbbbbbbblllllmmmmm"));
		System.out.println("Error rate: " + errorRate);
		
		System.out.println(errr("asdfgasdtrtuuib"));

	}
}
