package src.arrays.projects;

/**
 * Given a sorted array nums,
 * remove the duplicates in-place such that
 * each element appears only once and returns the new length.
 */
public class DuplicateNumberFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5, 6, 9, 11, 11, 23};
        System.out.println("unique length:: " + removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int noOfUniqueElements = 0; // O(1)
        for (int i = 0; i < nums.length - 1; i++) { //O(n-1)
            if (nums[i] != nums[i + 1]) { // O(1)
                noOfUniqueElements++; // O(1)
            }
        }
        return noOfUniqueElements + 1; // O(1)
    }
}
