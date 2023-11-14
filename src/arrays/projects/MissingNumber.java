package src.arrays.projects;

/**
 * Write Java function that takes an integer array containing
 * n-1 unique elements from a range of 1 to n,
 * with one missing number, and returns the missing number.
 * <p>
 * Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println("Missing Number : " + findMissingNumberInArray(arr));
        System.out.println("Missing Number : " + findMissingNumberInArrayUsingSum(arr));
    }

    static int findMissingNumberInArray(int[] arr) {
        System.out.println(arr.length);
        int missingNumber = 0;
        for (int number : arr) {
            if ((number - 1) != missingNumber) {
                missingNumber = number - 1;
                break;
            }
            missingNumber = number;
        }
        return missingNumber;
    }

    static int findMissingNumberInArrayUsingSum(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        System.out.println("Expected Sum: " + expectedSum);
        int actualSum = 0;
        for (int number : arr) {
            actualSum += number;
        }
        return expectedSum - actualSum;
    }


}
