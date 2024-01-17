package com.te.scratch.file;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id;
	private String name;
	
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
