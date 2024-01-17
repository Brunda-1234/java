package com.te.scratch.nestedclasses;

public class NonStaticNestedClass {
	
	static int k = 20;
	int j = 50;
	
	void normal() {
		System.out.println("Method in class OuterClass");
	}
	
	static void hard() {
		System.err.println("Static Method in OuterClass ");
	}
	
	class A{
		
		String a= "Brunda";
		static String b = "Ronaldo";
		
		void go() {
			System.out.println("Normal Method In Class A");
		}
		
		static void come() {
			System.err.println("Static Method in Class A");
		}
		
	}
	static class B{
		
		double d = 20;
	  	float b= 40;
		
		void can() {
			System.out.println("Normal MEthod in Class B");
		}
		
		static void hoo() {
			System.err.println("Static Method in Class B");
		}
	}
	
	
	public static void main(String[] args) {
		
		//OuterClass -- Static 
		System.err.println(k + " Static variable..");
		NonStaticNestedClass.hard();
		System.out.println();
		
		//OuterClass -- Non Static 
		NonStaticNestedClass class1 = new NonStaticNestedClass();
		System.out.println(class1.j + " Non Static Variable..");
		class1.normal();
		System.out.println();
		
		//Nested Class A  -- Static 
          System.err.println(NonStaticNestedClass.A.b);
          NonStaticNestedClass.A.come();
          System.out.println();
          
         //Nested Class A -- Non Static
         System.out.println(class1.new A().a);
         class1.new A().go();
         
         //Nested Class B -- Static
         NonStaticNestedClass.B.hoo();
//         System.out.println(class1.new B.b);
          
         
         
		
		
	}

}
