package com.te.scratch.finals.keywords;

class A{
	int i ;
	
	final int j ; //compile time error we need to intialize
	
	A(){
		j = 10;
	}
}
public class GlobalFinalVariablesExamples {

    public static void main(String[] args) {
		
//    	GlobalFinalVariablesExamples ex = new GlobalFinalVariablesExamples();
    	
    	A a = new A();
    	System.out.println(a.i);
    	System.out.println(a.j);
    	
	}
}
