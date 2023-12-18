package src.recursion.problems;

/**
 * Given a number N and a power P,
 * find the p of this number raised to the given power, i.e. N^P.
 * Input: N=5,P=2
 * Output: 5^2=25;
 */
public class Power {
    public static void main(String[] args) {
        long n = 5L;
        long p = 2L;
        System.out.println(n + "^" + p + "=" + power(n, p));
    }

    static long power(long n, long p) {
        if (n < 0) {
            return -1;
        }
        if (p == 0) {
            return 1;
        }
        return n * power(n, p - 1);
    }
}
