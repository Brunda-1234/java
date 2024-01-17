package com.te.scratch.file;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	
	public static void main(String[] args) {
		
		try {
			 BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\TYSS-1\\Desktop\\EmpDoc.txt"));
			
		     Employee emp = new Employee(100, "Ronaldo");
		     System.out.println(emp);
		    writer.write(emp.toString());
		    writer.flush();

		    Employee emp2 = new Employee(101,"Cristiano");
		    writer.write(emp2.toString());
		    writer.flush();
		    System.err.println("....................");
		    

		    
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
