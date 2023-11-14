package src.arrays.projects;

import java.util.Arrays;

/**
 * Write a function which takes integer array as a parameter
 * and returns a new integer array with unique elements. (remove duplicates)
 */
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        System.out.println("removed duplicates:: " + Arrays.toString(removeDuplicates(arr)));
    }

    public static int[] removeDuplicates(int[] nums) {
        int[] filteredArray = new int[nums.length];
        int index = 0;
        int lastAdded = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != lastAdded) {
                filteredArray[index] = nums[i];
                index++;
                lastAdded = nums[i];
            }
        }
        return Arrays.copyOf(filteredArray, index);
    }
}
