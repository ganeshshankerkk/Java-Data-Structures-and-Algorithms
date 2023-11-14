package src.arrays.singleDimensionalArray;

public class Main {
    public static void main(String[] args) {
        SingleDimensionalArray sda = new SingleDimensionalArray(5);
        sda.insert(0, 1);
        sda.insert(1, 2);
        sda.insert(2, 3);
        sda.insert(3, 4);
        sda.insert(5, 6);

        //Getting an element from the array based on index = O(1) time and space complexity
        System.out.println(sda.arr[0]);
        sda.traverseArray();
        sda.searchInArray(2);
        sda.deleteValueFromArray(3);
        sda.deleteValueFromArray(45);
    }
}
