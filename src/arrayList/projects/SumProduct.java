package src.arrayList.projects;

import java.util.ArrayList;
import java.util.Arrays;

public class SumProduct {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 2, 4, 6, 9, 11, 2));
        System.out.println(sumAndProduct(myList));
    }

    /**
     * Given a list of N numbers,
     * calculate the sum and product of N numbers
     *
     * @param myList
     * @return sum and product of N numbers
     */
    private static ArrayList sumAndProduct(ArrayList<Integer> myList) {
        int sum = 0; // O(1)
        int product = 1; // O(1)
        for (Integer num : myList) { // O(N)
            sum += num; // O(1)
            product *= num; // O(1)
        }
        return new ArrayList(Arrays.asList(sum, product));
    }
}
