package com.te.java.basic;

public class TestMain implements One,Two{

//	@Override
//	public void method() {
//		// TODO Auto-generated method stub
//		One.super.method();
//	}
	
	public static void main(String[] args) {
		
		TestMain main = new TestMain();
		main.method();
		main.method();
		
	}

@Override
public void method() {
	// TODO Auto-generated method stub
	One.super.method();
	
}

}
