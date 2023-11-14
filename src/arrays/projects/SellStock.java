package src.arrays.projects;

/**
 * You are given an array prices where prices[i]
 * is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing
 * a single day to buy one stock and choosing a
 * different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 */
public class SellStock {
    public static void main(String[] args) {
        int[] prices = {1, 7, 3, 5, 3, 6, 2, 12};
        System.out.println("Maximum profit: " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // O(1)
        int maxProfit = 0; // O(1)
        for (int price : prices) { // O(N)
            if (price < minPrice) { // O(1)
                minPrice = price; // O(1)
            } else if (price - minPrice > maxProfit) { // O(1)
                maxProfit = price - minPrice; // O(1)
            }
        }
        return maxProfit; // O(1)
    }
}
