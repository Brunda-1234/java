package com.te.scratch.finals.keywords;

class BB{
	
   final void go() {
		System.out.println("Final MEthod");
	}
	
	void go(int i) {
		System.out.println("Overloaded final method");
	}
}
public class AA extends BB{

	//can't be overridde inmplicitly 
	//explicitly we have to override
	@Override
	void go(int i) {
		System.out.println("Overridden in subclass");
	}
	
	
	public static void main(String[] args) {
		
		AA aa = new AA();
		aa.go(2);
	}

}
