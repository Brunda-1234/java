package com.te.my.programs;

public class MyClass {
    private String name;
    private int age;
    private int ph;

    // Default constructor calls the parameterized constructor
    public MyClass() {
        this("DefaultName", 0);
    }

    // Parameterized constructor with two parameters
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public MyClass(String name, int age,int ph) {
       this(name,age);
       this.ph = ph;
    }
    

    // Getter methods (not shown for brevity)

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPh() {
		return ph;
	}

	public void setPh(int ph) {
		this.ph = ph;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
        // Creating objects using different constructors
        MyClass obj1 = new MyClass();             // Calls the default constructor
        MyClass obj2 = new MyClass("John", 25);   // Calls the parameterized constructor

        // Accessing object properties
        System.out.println(obj1.getName());      // Prints "DefaultName"
        System.out.println(obj2.getName());      // Prints "John"
    }
}
