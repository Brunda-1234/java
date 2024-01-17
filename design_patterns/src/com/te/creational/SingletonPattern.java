package com.te.creational;

class Single{
	
    private static Single pattern;
	
	private Single(){
		
	}
	
	public static Single getSingle() {
		
		if(pattern == null) {
			
			synchronized (SingletonPattern.class) {
				
				if(pattern == null) {
					pattern = new Single();
				}
			}
		}
		return pattern;
	}

}
public class SingletonPattern {
	
	public static void main(String[] args) {
		
		Single a = Single.getSingle();
		Single b = Single.getSingle();
		if(a == b) {
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());
		}
		
	}
	
}
