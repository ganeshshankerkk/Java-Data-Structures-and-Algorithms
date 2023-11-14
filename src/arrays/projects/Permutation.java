package src.arrays.projects;

/**
 * check if two integer arrays are
 * permutation of each other.
 */
public class Permutation {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 1, 2, 3, 4};
        System.out.println(permutation(array1, array2));
        System.out.println(isPermutation(array1, array2));
    }

    static boolean isPermutation(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        int sumOne = 0;
        int sumTwo = 0;
        int productOne = 1;
        int productTwo = 1;
        for (int i = 0; i < array1.length; i++) {
            sumOne += array1[i];
            sumTwo += array2[i];
            productOne *= array1[i];
            productTwo *= array2[i];
        }
        if (sumOne == sumTwo && productOne == productTwo) {
            return true;
        }
        return false;
    }

    static boolean permutation(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int num1 : array1) {
            for (int i = 0; i < array2.length; i++) {
                if (num1 == array2[i]) {
                    break;
                } else if (((i == array2.length - 1) && num1 != array2[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
