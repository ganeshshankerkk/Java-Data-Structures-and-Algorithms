package src.arrayList.projects;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create a function which returns the pairs from given array
 */
public class PrintPairs {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(printPairs(intList));
    }

    static ArrayList<String> printPairs(ArrayList<Integer> intList) {
        ArrayList<String> pairs = new ArrayList<>();
        for (Integer number : intList) {
            for (int i = 0; i < intList.size(); i++) {
                String s = String.valueOf(intList.get(i));
                pairs.add("(" + number + "," + s + ")");
            }
        }
        return pairs;
    }
}
