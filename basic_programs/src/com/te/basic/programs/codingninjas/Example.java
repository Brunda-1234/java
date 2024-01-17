package com.te.basic.programs.codingninjas;



class Test extends Exception{
	
}
public class Example {

	public static void main(String[] args) {
		
		try {
			throw new Test();
		}catch(Test t){
			System.out.println("catch Block executed");
		}finally {
			System.out.println("Finally Block Executed");
		}
	}
}
