package CollectionPrectice;

public class MaxOnesRow {
//Write a program to find a row from 2d integer array which has the highest number of 1's in it (with less time complexity) .
	public static int findMaxOnesRow(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int maxOnesRow = -1; // Row index with the maximum number of ones
		int maxOnesCount = 0; // Count of ones in the row

		int row = 0; // Start from the first row
		int col = cols - 1; // Start from the last column

		while (row < rows && col >= 0) {
			// If the current element is 1, move to the left in the same row
			if (matrix[row][col] == 1) {
				col--;
				maxOnesRow = row; // Update the current row as the potential maximum
				maxOnesCount = cols - col; // Update the count of ones in the row
			} else {
				// If the current element is 0, move to the next row
				row++;
			}
		}

		return maxOnesRow;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1, 1 }, 
				           { 0, 0, 1, 1 },
				           { 1, 1, 1, 1 },
				           { 0, 0, 0, 0 } };

		int result = findMaxOnesRow(matrix);

		if (result != -1) {
			System.out.println("Row with the maximum number of 1's: " + result);
		} else {
			System.out.println("No row with 1's found.");
		}
	}

	//output = Row with the maximum number of 1's: 2
}
