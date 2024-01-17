package com.te.scratch.constructors;

import java.lang.reflect.Constructor;

public class Example {
    public static void main(final String[] args) throws Exception {
   Constructor<Foo> constructor = Foo.class.getDeclaredConstructor();
        System.out.println(constructor);
        constructor.setAccessible(true);
        Foo foo = constructor.newInstance();

        System.err.println( foo.getA(10));
        System.out.println(foo);
    }
}

class Foo {
	
	private int a;
    private Foo() {
        // private!
    }
//    private Foo(int h) {
//    	this.a = h;
//    }
    
    public int getA(int g) {
    	return a;
    }

    @Override
    public String toString() {
        return "I'm a Foo and I'm alright!";
    }
}