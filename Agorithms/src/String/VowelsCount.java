package String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class VowelsCount {
	
	public static void main(String[] args) {
		
		String s = "abbceo";
		
		check(s);
		checkUsingJava(s);
	   
	}

	private static void checkUsingJava(String s) {
		 Long collect = Arrays.stream(s.split("")).filter(i->i.matches("^[aeiou]")).collect(Collectors.counting());
		 System.err.println(collect);
	}

	private static void check(String s) {
		char[] c = s.toLowerCase().toCharArray();
		int count = 0;
		for(int i =0;i<c.length;i++) {
			if(Character.isAlphabetic(c[i]) && c[i] == 'a' ||c[i]=='e'||c[i]=='o'||c[i]=='i'||c[i] =='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
