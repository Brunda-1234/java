package com.te.basic.programs.numericals;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Fact{

static int fact(int n){

   return IntStream.rangeClosed(1,n).reduce(1,(a,b)-> a*b);
}
public static void main(String[] args){

   System.out.println(fact(5));
   
   int[]  array = {1,3,4};
    int orElse = Arrays.stream(array).reduce((x,y)-> x+y).orElse(0);
    System.out.println(orElse);
   
}
}
