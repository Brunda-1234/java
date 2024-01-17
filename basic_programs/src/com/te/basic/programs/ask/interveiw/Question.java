package com.te.basic.programs.ask.interveiw;

class Test{
	static int i = m2(); //first static variable executed
	Test(){
		System.out.println("A");
	}
	int m1() {
		System.out.println("B");
		return 10;
	}
	static {  //second static blocks executed
		System.out.println("C");
	}
	int j = m1();  //fourth instance variables
	{
		System.out.println("D");
	}
	
	 static int m2() {   //third static methods executed
		System.out.println("E");
		return 10;
	}
}
public class Question {
	
	public static void main(String[] args) {
		
		Test t = new Test();
	}

}
