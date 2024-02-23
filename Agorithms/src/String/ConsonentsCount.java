package String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConsonentsCount {

	public static void main(String[] args) {
		
		String s = "abefgh";
//		checkJava8(s);
//		check(s);
		checkTo(s);
	}

	private static void checkTo(String s) {
		String[] split = s.split("");
		
		 int count1 = 0;
         int start = 0;
         int end = split.length;
         int count1 = 0;
         int start = 0;
         int end = split.length;
         while(start<end) {
        	 if(split[start].toLowerCase().matches("[^aeiou]")) {
        		 count1++;
        	 }
        	 
         }
         System.err.println(count1);        	 
       
        	 start++;
         }
         System.err.println(count1);

	}

	private static void check(String s) {
         int count =0;
         String[] split = s.split("");
         for(int i =0;i<split.length;i++) {
        	 if(split[i].matches("[^aeiou]")) {
        		 count++;
        	 }
         }
         System.out.println(count);
        
	}

	private static void checkJava8(String s) {

     Long collect = Arrays.stream(s.toLowerCase().split("")).filter(i->i.matches("^[^aeiou]$")).collect(Collectors.counting());
     System.err.println(collect);
	}
}
