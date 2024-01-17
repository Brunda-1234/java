package com.te.scratch.keywords;



//@SuppressWarnings("serial")
//public class TransientExample implements Serializable{
//	
//	int a =10;
//	transient String s  = "Uma";
//	transient float n = 10f;
//	float  g= 10.20f;
//	 transient  int b = 50;
//	 String m = "Kashi";
//	 
//	 
//	public static void main(String[] args) {
//		
//		TransientExample ex = new TransientExample();
//		System.out.println(ex.a);
//		System.out.println(ex.s + "  Transient String" );
//		System.out.println(ex.n + "  Transient Float");
//		System.out.println(ex.g);
//		System.out.println(ex.b + " Transient INt");
//		System.out.println(ex.m);
//		
//		
//		
//	
//		
//	}
//
//}

//Java program to demonstrate transient keyword
//Filename Test.java
import java.io.*;
@SuppressWarnings("serial")
public class Test implements Serializable
{
 // Normal variables
 int i = 10, j = 20;

 // Transient variables
 transient int k = 30;
 transient String s = "Ronaldo";

 // Use of transient has no impact here
 transient static int l = 40;
 transient final int m = 50;
 transient float p = 10f;
 
 public static void main(String[] args) throws Exception
 {
     Test input = new Test();

     // serialization
     FileOutputStream fos = new FileOutputStream("abc.txt");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(input);

     // de-serialization
     FileInputStream fis = new FileInputStream("abc.txt");
     ObjectInputStream ois = new ObjectInputStream(fis);
     Test output = (Test)ois.readObject();
     System.out.println("i = " + output.i);
     System.out.println("j = " + output.j);
     System.out.println("k = " + output.k);
     System.out.println("l = " + output.l);  
     System.out.println("m = " + output.m);
     System.out.println("s = " + output.s);
     System.out.println("p = " + output.p);
 }
}