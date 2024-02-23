package com.te.my.programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Shoe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: Number of shoes (N)
		int N = scanner.nextInt();
		// Input: Sizes of N shoes separated by space
		int[] sizes = new int[N];
		for (int i = 0; i < N; i++) {
			sizes[i] = scanner.nextInt();
		}

		// Output: Number of unpaired shoes
		int result = countUnpairedShoes(N, sizes);
		System.out.println(result);

		scanner.close();
		//if we tried to 
	
	}

// Function to calculate the number of unpaired shoes
	private static int countUnpairedShoes(int N, int[] sizes) {
		Set<Integer> pairedShoes = new HashSet<>();
		int unpairedCount = 0;

		System.err.println(pairedShoes);
		for (int size : sizes) {
			if (pairedShoes.contains(size)) {
				pairedShoes.remove(size);
				unpairedCount--;
			} else {
				pairedShoes.add(size);
				unpairedCount++;
			}
			System.out.println(pairedShoes);
		}

		return unpairedCount;
	}
}



//updated code for shoes
//shoe