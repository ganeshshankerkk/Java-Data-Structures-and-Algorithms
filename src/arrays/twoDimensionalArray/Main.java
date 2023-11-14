package src.arrays.twoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] int2dArray; // O(1)
        int2dArray = new int[2][2]; // O(1)
        int2dArray[0][0] = 1; // O(1)
        int2dArray[0][1] = 2; // O(1)
        int2dArray[1][0] = 3; // O(1)
        int2dArray[1][1] = 4; // O(1) //All for combined is O(mn) where m = no of rows, and n = no of columns

        System.out.println(Arrays.deepToString(int2dArray));

        String[][] s2dArray = {{"abc", "def"}, {"ghi", "jkl"}}; //O(1)

        System.out.println(Arrays.deepToString(s2dArray));

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(3, 3);
        twoDimensionalArray.insertValueInTheArray(0, 0, 10);
        twoDimensionalArray.insertValueInTheArray(0, 1, 1);
        twoDimensionalArray.insertValueInTheArray(0, 2, 54);
        twoDimensionalArray.insertValueInTheArray(1, 1, 5);
        System.out.println(Arrays.deepToString(twoDimensionalArray.arr));
        twoDimensionalArray.getCellValue(0, 0);
        twoDimensionalArray.getCellValue(4, 5);
        twoDimensionalArray.traverseArray();
        System.out.println(twoDimensionalArray.isValuePresent(540));
        twoDimensionalArray.deleteValueFromArray(0, 0);
    }
}
