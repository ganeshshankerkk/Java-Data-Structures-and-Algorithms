package src.arrayList.projects;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create a method which take an array as a parameter
 * and return the reverse of the array
 */
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int[] myIntArr = new int[]{1, 2, 3, 4, 5};
        reverse(arrayList);
        reverse(myIntArr);
    }

    static void reverse(ArrayList<Integer> arrayList) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) { // O(N/2). After eliminating constants O(N)
            int other = arr[arr.length - i - 1]; // O(1)
            int temp = arr[i];// O(1)
            arr[i] = other;// O(1)
            arr[arr.length - i - 1] = temp;// O(1)
        }
        System.out.println(Arrays.toString(arr)); // O(1)
    }
}
