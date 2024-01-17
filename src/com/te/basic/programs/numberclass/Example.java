package com.te.basic.programs.numberclass;

public class Example extends Number{

	public static void main(String[] args) {
		
		Example example = new Example();
		System.out.println(example.longValue());
	}
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 120;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 30.00;
	}

}
