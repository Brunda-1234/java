package com.te.java.basic.classprograms;

public class ShapeImplementation{
	
	 public static void main(String[] args) {
		
	new Shape() {
			
			@Override
			void draw() {
				System.out.println("Print Some thing....");
			}
		}.draw();
	}
}
