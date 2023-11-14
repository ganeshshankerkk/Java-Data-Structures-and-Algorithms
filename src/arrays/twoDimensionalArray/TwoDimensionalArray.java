package src.arrays.twoDimensionalArray;

/**
 * @author Ganesh Shanker K K
 * Creating an empty array = O(1) Time complexity, O(MN) Space complexity
 * Inserting a value in an array = O(1) Time complexity, O(1) Space complexity
 * Traversing a given array = O(MN) Time complexity, O(1) Space complexity
 * Accessing a given cell = O(1) Time complexity, O(1) Space complexity
 * Searching a given value = O(MN) Time complexity, O(1) Space complexity
 * Deleting a given value = O(1) Time complexity, O(1) Space complexity
 */
public class TwoDimensionalArray {
    int arr[][];

    /**
     * Parameterized Constructor
     *
     * @param numberOfRows
     * @param numberOfColumns
     */
    TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    /**
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @param rowIndex
     * @param columnIndex
     * @param value
     */
    public void insertValueInTheArray(int rowIndex, int columnIndex, int value) {
        try {
            if (arr[rowIndex][columnIndex] == Integer.MIN_VALUE) { // O(1)
                arr[rowIndex][columnIndex] = value; // O(1)
                System.out.println(value + " inserted to the array successfully."); // O(1)
            } else {
                System.out.println("Sorry. Cell already occupied."); // O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array"); // O(1)
        }
    }

    /**
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @param row
     * @param column
     */
    public void getCellValue(int row, int column) {
        System.out.println("Reading cell with row = " + row + ", column = " + column); // O(1)
        try {
            System.out.println("Cell value is :: " + arr[row][column]); // O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array"); // O(1)
        }
    }

    /**
     * Traversing the array
     * Time complexity  = O(MN)
     * Space Complexity = O(1)
     */
    public void traverseArray() {
        try {
            for (int row = 0; row < arr.length; row++) { // O(M) where M = no of rows;
                for (int col = 0; col < arr[0].length; col++) { // O(N) where N = no of columns;
                    System.out.print(arr[row][col] + " "); // O(1)
                }
                System.out.println(); // O(1)
            }
        } catch (Exception e) {
            System.out.println("Array do not exists"); // O(1)
        }
    }

    /**
     * Linear search to check if given
     * value is present in the array
     * Time Complexity = O(MN)
     * Space Complexity = O(1)
     *
     * @param value
     * @return true if element is present
     * and false otherwise
     */
    public boolean isValuePresent(int value) {
        for (int row = 0; row < arr.length; row++) { // O(M) where M = no of rows;
            for (int col = 0; col < arr[0].length; col++) { // O(N) where N = no of columns;
                if (arr[row][col] == value) { // O(1)
                    System.out.println(value + " is present in the array"); // O(1)
                    return true;
                }
            }
        }
        System.out.println(value + " is not present in the array"); // O(1)
        return false;
    }

    /**
     * We are not technically deleting an array index.
     * We are only setting the given array index value to
     * minimum integer value
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     *
     * @param row
     * @param column
     */
    public void deleteValueFromArray(int row, int column) {
        try {
            arr[row][column] = Integer.MIN_VALUE; // O(1)
            System.out.println("Value at row = " + row + ", column = " + column + " deleted successfully"); // O(1)
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index provided is beyond the range of array"); // O(1)
        }
    }
}
