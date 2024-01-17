package com.te.basic.programs.threads;

class MedicalTest extends Thread {

	public void run() {
		System.out.println("Medical Test Started: ");
		try {
			Thread.sleep(5000);
			System.out.println("Medical Test Completed");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}

class DriverTest extends Thread {
	public void run() {
		System.out.println("Driver Test started");
		try {
			Thread.sleep(8000);
		    System.out.println("Driver Test completed ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class OfficerTest extends Thread{
	public void run() {
		System.out.println("Officer Test started");
		try {
			Thread.sleep(2000);
			System.out.println("Officer Test Completed ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Licence {
	
	public static void main(String[] args) throws InterruptedException {
		
		MedicalTest medicalTest = new MedicalTest();
		medicalTest.start();
		medicalTest.join();
		
		DriverTest driverTest = new DriverTest();
		driverTest.start();
		driverTest.join();
		
		OfficerTest officerTest = new OfficerTest();
		officerTest.start();
		officerTest.join();
		
		
	}

}
