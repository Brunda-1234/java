package com.te.scratch.abstractclass;

abstract class Abhi{
    private int i;
	
	abstract void go();
	
	void come() {
		System.out.println("Come fast");
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
public class Train extends Abhi{

	@Override
	void go() {
		System.out.println("Hiii Pikacho");
		
	}
	
	public static void main(String[] args) {
		
		Train train = new Train();
		
		System.out.println(train.getI());
	}

	
}
