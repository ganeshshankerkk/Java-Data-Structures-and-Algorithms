package src.arrays.projects;

import java.util.Arrays;

/**
 * Given an array, write a function to get first and second best scores
 * from the array and return it in new array.
 * Array may contain duplicates.
 */
public class BestScore {
    public static void main(String[] args) {
        int[] arr = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        System.out.println("BestScore:: " + Arrays.toString(findTopTwoScores(arr)));

    }

    /**
     * overall time complexity is O(n)
     *
     * @param array integer list of scores
     * @return top two scores from the given array
     */
    static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE; // O(1)
        int secondHighest = Integer.MIN_VALUE; // O(1)
        for (int score : array) { // O(N)
            if (score > firstHighest) { // O(1)
                secondHighest = firstHighest; // O(1)
                firstHighest = score; // O(1)
            } else if (score > secondHighest && score < firstHighest) { // O(1)
                secondHighest = score; // O(1)
            }
        }
        return new int[]{firstHighest, secondHighest}; // O(1)
    }
}
