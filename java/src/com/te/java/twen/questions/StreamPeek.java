package com.te.java.twen.questions;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamPeek {

	
	public static void main(String[] args) {
		
		Object[] array = Stream.of(1,1,2,3,4,5).peek(i-> System.out.println("The Array Debugged")).toArray();
		System.out.println(Arrays.toString(array));
		
		/*
		 * Peek() is a intermediate function in stream 
		 * this will debugg the stream operation
		 * input -- it accepts consumer
		 */
	}
}
