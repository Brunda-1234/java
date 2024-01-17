package com.te.java.basic;

public interface One extends Four {

	default void method() {
		System.out.println("Hello...");
	}
}
