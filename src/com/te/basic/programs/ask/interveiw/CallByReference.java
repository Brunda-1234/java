package com.te.basic.programs.ask.interveiw;

class car{
	String name;
	Float milage;
	int price;
	
}
public class CallByReference {

	
	public static void main(String[] args) {
		
		car a = new car();
		a.name = "BMW";
		a.milage = 25.3f;
		a.price = 75;
		
		System.out.println(a.name);//BMW
		System.out.println(a.milage);//25.3
		System.out.println(a.price);//	75
		
		car b ;
		b = a;
		System.out.println(b.name);//BMW
		System.out.println(b.milage);//25.3
		System.out.println(b.price);//	75
		
		
		b.name = "TATA";
		b.milage = 36.5f;
		b.price = 85;
		
		System.out.println(b.name);//TATA
		System.out.println(b.milage);//36.3
		System.out.println(b.price);//85
		
		System.out.println(a.name);//TATA
		System.out.println(a.milage);//36.3
		System.out.println(a.price);//85
		
		/*while call by reference
		 *   the address of the object is stored in the a 
		 *   
		 *  b=a;
		 *   the address of the a is stored in the b
		 *   
		 * 
		 *
		 * bcz  b having the same address of the a 
		 * so if i change the value in the b it will reflect in the a value also
		 * 
		 */
		
		
	}
}
