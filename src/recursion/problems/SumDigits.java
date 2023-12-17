package src.recursion.problems;

/**
 * Find sum of digits of a number
 * using recursion
 * Input: 456
 * Output: 15 (4+5+6=15)
 */
public class SumDigits {
    public static void main(String[] args) {
        int number = 456;
        System.out.println("Sum of the digits in " + number + " is " + sumDigits(number));
    }

    static int sumDigits(int number) {
        if (number == 0 || number < 0) {
            return 0;
        }
        return (number % 10) + sumDigits(number / 10);
    }

}
