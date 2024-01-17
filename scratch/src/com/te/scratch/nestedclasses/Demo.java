package com.te.scratch.nestedclasses;

abstract class A{
	public abstract int come();
}
public class Demo {
	
	public final int go() {
		System.out.println("Hlw Im parent");
		return 8;
	}
	public static void main(String[] args) {
		
		
		A a = new A(){

			Demo demo = new Demo();
		   
			
			@Override
			public int come() {
				System.out.println("hi  im Child Impl");
				return 7;
				
			}
			
		};
		System.err.println(a.come());
		
	}

}
