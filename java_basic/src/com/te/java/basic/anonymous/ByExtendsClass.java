package com.te.java.basic.anonymous;

class Popcorn{
	
	public void taste() {
		System.out.println("Salty");
	}
}
public class ByExtendsClass {
	
	public static void main(String[] args) {
		
		Popcorn popcorn = new Popcorn() {
			
			public void taste() {
				System.out.println("spicy");
			}
		};
		
		popcorn.taste();
		
	}

}

/*
 * ouput  :== spicy
 * 
 *  here 3 .class file created 
 *     Popcorn.class
 *     ByExtendsClass.class
 *     ByExtendsClass$1.class   -- this is a class which is not having the name
 *  
 */
