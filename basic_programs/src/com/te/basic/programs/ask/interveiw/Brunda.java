package com.te.basic.programs.ask.interveiw;

import java.util.Arrays;
import java.util.Collections;

public class Brunda {
	/*function reverses the elements of the array*/
    static void reverse(Integer myArray[]) 
    { 
        Collections.reverse(Arrays.asList(myArray)); 
        System.out.println("Reversed Array:" + Arrays.asList(myArray)); 
    } 
 
     public static void main(String[] args) 
    { 
        Integer [] myArray = {1,3,5,7,9}; 
        System.out.println("Original Array:" + Arrays.asList(myArray));
        reverse(myArray); 
    } 
}
