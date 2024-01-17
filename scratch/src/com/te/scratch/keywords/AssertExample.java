package com.te.scratch.keywords;

import java.util.Scanner;

public class AssertExample {
    public static void main(String[] args) {
        int num = -5;
        assert num >= 0 : "Number should be non-negative";

        System.out.println("The number is: " + num);
    }
}
