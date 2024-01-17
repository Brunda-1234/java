package com.te.basic.programs.java8;

public class ReverseAString {
	String s = "Brunda Sahukar";
	String s2 = "";

	public static void main(String[] args) {
		
		ReverseAString reverseAString = new ReverseAString();
         String[] split = reverseAString.s.split(" ");
         String string = split[0];
         System.out.println(split[0]+ " aaaaaaaa");
		string.chars().forEach(i -> {

//			if(char)
			
			reverseAString.s2 = (char)i + reverseAString.s2;
			
			

		});
		System.out.println(reverseAString.s2 + " "+split[1]);
		
	}
		
		/*
		 * String s = "Brunda"; 
		 * String s2 = "";
		 * 
		 * s.chars().forEach(i->{ s2 = (char)i +s2; });
		 *  System.out.println(s2);
		 *  
		 *  
		 *  here im using the local variables inside the foreach 
		 *  its showing error
		 * " Local variable s2 defined in an enclosing scope must be final or effectively final"
		 * 
		 * why error: bcz 
		 * 
		 * In Java, when you use a local variable inside a lambda expression or an anonymous inner class,
		 *  that variable is effectively treated as if it were final or effectively final.
		 *  This means you cannot reassign a new value to it once it has been assigned within the same scope.
		 *  
		 *  to overcome this we can use static global members or non static global members
		 *   
		 */
		
}
