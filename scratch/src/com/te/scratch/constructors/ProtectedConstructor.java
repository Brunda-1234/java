package com.te.scratch.constructors;

public class ProtectedConstructor {

	protected ProtectedConstructor() {
		super();
		
	}
	public static void main(String[] args) {
		
		ProtectedConstructor constructor = new ProtectedConstructor();
		B b = new B();
		
	}
}

class G{
	
	protected G() {
		super();
		
	}
	
}
