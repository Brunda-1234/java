package com.te.basic.programs.codewars;

public class Pump {
	
	public static boolean map(double distToPump,double milesPerGallon,double fuelLeft) {
		return distToPump <= milesPerGallon*fuelLeft;
	}

	
	public static void main(String[] args) {
		
		System.out.println(Pump.map(50, 25, 2));
	}
}
