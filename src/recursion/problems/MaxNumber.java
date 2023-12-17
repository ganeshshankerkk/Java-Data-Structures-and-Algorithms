package src.recursion.problems;

/**
 * Calculating the maximum number recursively
 * from an unsorted list of numbers
 * Example : {5, 4, 10, 8}
 * max(arr[3], maxNum(arr, 3))                       -> max(8, 10)  -> 10
 *             -> max(arr[2], maxNum(arr, 2))        -> max(10,5)   -> 10
 *                            -> max(arr[1], arr[0]) -> max(4,5)    -> 5
 */
public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 10, 8};
        System.out.println("Max number is " + maxNum(arr, arr.length));
    }
    
    static int maxNum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return max(arr[n - 1], maxNum(arr, n - 1));
    }

    static int max(int x, int y) {
        return (x >= y) ? x : y;
    }
}
