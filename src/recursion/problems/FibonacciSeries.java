package src.recursion.problems;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacciSeries(n));
    }

    static int fibonacciSeries(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }
}
