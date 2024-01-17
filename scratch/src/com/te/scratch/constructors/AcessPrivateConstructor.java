package com.te.scratch.constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AcessPrivateConstructor {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
			
			 Constructor<D> constructor =
		D.class.getDeclaredConstructor(int.class,int.class);
			 Constructor<D> cons2 = D.class.getDeclaredConstructor(String.class);
			 System.err.println(constructor);
				constructor.setAccessible(true);
				cons2.setAccessible(true);
				
				D obj1 = constructor.newInstance(10,20);
				D obj2 = cons2.newInstance("Cristiano Ronaldo");
				System.err.println(obj1.getA());
				System.out.println(obj1.getB());
				System.out.println(obj2.getName());

	}
}
class D {
	private int a;
	private int b;
	private String name;
	private float game;
	private double invest;
	
	private D() {
		
	}
	
	private D(int c,int d) {
		this.a = c;
		this.b = d;
	}
	
	private D(String j) {
		this.name = j;
	}
	
	private D(float k ) {
		this.game = k;
	}
	
	private D(double l) {
		this.invest = l;
	}
	

	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public String getName() {
		return name;
	}
	public float getGame() {
		return game;
	}
	public double getInvest() {
		return invest;
	}
}