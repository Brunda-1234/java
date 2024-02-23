package com.te.my.programs;

import java.util.Scanner;

public class BinaryDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Toggled binary string
        String toggledBinaryString = scanner.next();

        // Output: Decimal number
        int originalNumber = findOriginalNumber(toggledBinaryString);
        System.out.println(originalNumber);

        scanner.close();
    }

    // Function to find the original decimal number from the toggled binary string
    private static int findOriginalNumber(String toggledBinaryString) {
        // Step 1: Reverse the toggling process to obtain the original binary string
        StringBuilder originalBinaryStringBuilder = new StringBuilder();
        for (char bit : toggledBinaryString.toCharArray()) {
            char originalBit = (bit == '0') ? '1' : '0';
            originalBinaryStringBuilder.append(originalBit);
        }
        String originalBinaryString = originalBinaryStringBuilder.toString();

        System.out.println(originalBinaryString);
        // Step 2: Convert the original binary string to decimal
        int originalNumber = Integer.parseInt(originalBinaryString, 2);
        System.err.println(originalNumber);

        return originalNumber;
    }
    
    
}
/*
 * input: ==111010
 * ouput:== 5
 */
