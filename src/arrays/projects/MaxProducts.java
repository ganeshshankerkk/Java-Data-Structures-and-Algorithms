package src.arrays.projects;

/**
 * find maximum product of two integers in the array
 * where all elements are positive.
 */
public class MaxProducts {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Max product: " + maxProduct(arr));

    }

    public static String maxProduct(int[] intArray) {
        String maxIndices = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > max) {
                    max = intArray[i] * intArray[j];
                    maxIndices = intArray[i] + "," + intArray[j];
                }
            }
        }
        return maxIndices;
    }
}
