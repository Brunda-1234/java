package CollectionPrectice;

public class MissingPositive {
/*
 * DSA problem given an array with negative and positive integer, find the first positive number 
 * and find the range between that positive number and 1 and print that integer which is not present in the array. 
 * (time complexity and algorithm), and he doesn't want to sort the array to get the output.    
 */
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Perform cyclic sort to place positive integers at their correct positions
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positive integers from 1 to n are present, the missing one is n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, -1, 1};
        int result = firstMissingPositive(array);
        System.out.println("The first missing positive integer is: " + result);
    }
    
   //output =The first missing positive integer is: 2
}
