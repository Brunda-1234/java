package com.te.basic.programs.ask.interveiw;

class A{
	void a(){
		System.out.println("Hii im a Parent");
	}
}

class B extends A{
	
	void a() {
		System.out.println("Hlw Im a Child");
	}
}
public class LooseCoupling {

	public static void main(String[] args) {
		
		B b = new B();
		A a = b;
		a.a();
	}
}
