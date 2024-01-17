package com.te.scratch.finals.keywords;

public class NonStaticFinalExample {
	
	final int i ;
	
	{
		i=10;//we can initialize in IIB Bcz This block executed while object creation
	
	}
	
	{
//		i = 80;  BCZ ITS FINAL compile time error
	}
	
	//we can initialize in constructors in the  
	NonStaticFinalExample(){
//		i =80; compile time error
	}
	
	NonStaticFinalExample(int l){
//		l = i;// we can re assign the value of fial variable
//		i =l; compiler error
	}
	
	
	
	

}
