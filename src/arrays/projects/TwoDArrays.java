package src.arrays.projects;

/**
 * Given 2D array calculate the sum of diagonal elements.
 */
public class TwoDArrays {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum:: " + sumDiagonalElements(arr));
    }
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int row=0; row< array.length; row++){
            for(int col = 0 ; col<array[row].length;col++){
                if(row == col){
                    sum+= array[row][col];
                }
            }
        }
        return sum;
    }
}
