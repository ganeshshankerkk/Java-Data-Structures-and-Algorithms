package src.arrays.singleDimensionalArray;

/**
 * @author Ganesh Shanker K K
 * Creating an empty array = O(1) Time complexity, O(N) Space complexity
 * Inserting a value in an array = O(1) Time complexity, O(1) Space complexity
 * Traversing a given array = O(N) Time complexity, O(1) Space complexity
 * Accessing a given cell = O(1) Time complexity, O(1) Space complexity
 * Searching a given value = O(N) Time complexity, O(1) Space complexity
 * Deleting a given value = O(1) Time complexity, O(1) Space complexity
 */
public class SingleDimensionalArray {
    int[] arr;

    /**
     * Parameterized Constructor
     * that initialize the array
     *
     * @param length length of the array
     */
    SingleDimensionalArray(int length) {
        arr = new int[length];
        for (int i = 0; i < arr.length; i++) { // O(N)
            arr[i] = Integer.MIN_VALUE;
        }
    }

    /**
     * Validates if element already present in the given index.
     * Inserts the given value to the given array location.
     * If element already present, prints error to the console
     *
     * @param location          array index where the element is to be inserted
     * @param valueToBeInserted value to be inserted in the array index
     */
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) { // O(1)
                arr[location] = valueToBeInserted; // O(1)
                System.out.println(valueToBeInserted + " added at array index " + location + " successfully."); // O(1)
            } else {
                System.out.println("Sorry. An element already exists at array index " + location); // O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry. Given length exceeds total array length"); // O(1)
        }
    }

    /**
     * Traverse the array and print elements present
     * in each index to the console
     * O(N) time complexity
     * O(1) space complexity as extra memory is not required
     * since we directly print to the console
     */
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) { // O(N)
                System.out.print(arr[i] + " "); // O(1)
            }
        } catch (Exception e) {
            System.out.println("Array do not exists"); // O(1)
        }
    }

    /**
     * Search for the element in array using linear search
     * Time complexity = O(N)
     * Space complexity = O(1)
     *
     * @param valueToBeSearched element to be searched in array
     */
    public void searchInArray(int valueToBeSearched) {
        for (int i = 0; i < arr.length; i++) { // O(N)
            if (arr[i] == valueToBeSearched) { // )(1)
                System.out.println(valueToBeSearched + " is present at array index " + i); // O(1)
                return;
            }
        }
        System.out.println(valueToBeSearched + " is not present in array"); // O(1)
    }

    /**
     * We are not technically deleting an array index.
     * We are only setting the given array index value to
     * minimum integer value
     *
     * @param valueToDeleteIndex
     */
    public void deleteValueFromArray(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE; // O(1)
            System.out.println("Value at index  " + valueToDeleteIndex + " deleted successfully"); // O(1)
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index provided is beyond the range of array"); // O(1)
        }
    }
}
