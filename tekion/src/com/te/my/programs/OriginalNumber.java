package com.te.my.programs;

import java.util.Scanner;

public class OriginalNumber {

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
        int originalNumber = 0;

        // Iterate through each bit in reverse order
        for (int i = toggledBinaryString.length() - 1, power = 0; i >= 0; i--, power++) {
            // If the bit is '0', add 2^power to the original number
            if (toggledBinaryString.charAt(i) == '0') {
                originalNumber += Math.pow(2, power);
            }
        }

        return originalNumber;
    }
}
