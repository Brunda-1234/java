package com.te.scratch.keywords;

interface Ashaya {
	void come();

	default void stand() {
		System.out.println("Default methods");
	}
}

public class DefaultExample implements Ashaya {

	public static void main(String[] args) {

		DefaultExample example 
		 = new DefaultExample();
		example.come();
		
	}

	@Override
	public void come() {
		System.out.println("Come to implementation class");

	}

}
