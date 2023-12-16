package src.recursion.problems;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(" 2^" + n + " = " + powerOfTwo(n));
    }

    static int powerOfTwo(long n) {
        if (n == 0) {
            return 1;
        } else {
            int power = 2 * powerOfTwo(n - 1);
            return power;
        }
    }
}
