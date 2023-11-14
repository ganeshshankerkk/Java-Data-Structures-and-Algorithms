package src.arrays.projects;

public class UniqueElements {
    public static void main(String[] args) {
        System.out.println("isUnique: " + isUnique(new int[]{1, 2, 3, 4, 5, 6, 6}));
    }

    public static boolean isUnique(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    //System.out.println(i + " " + j);
                    return false;
                }
            }
        }
        return true;
    }
}

