package src.recursion.problems;

/**
 * <p>Given a number n, find the
 * nth fibonacci number.
 * In mathematical terms, the sequence F(N) of
 * fibonacci numbers is defined by the recurrence
 * relation: F(N) = F(N-1) + F(N-2)
 * If n = 0, then return 0
 * If n = 1, then return 1
 * If n > 1, return F(N-1) + F(N-2)
 * If n < 0, return -1;
 * </p>
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Fibonacci Number in the position " + n + " is " + fibonacciNumber(n));
    }

    static int fibonacciNumber(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
}
