package src.stack.problems.dailyTemperature;

import java.util.Arrays;
import java.util.Stack;

/**
 * Leet Code 739 problem solution
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days
 * you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */
public class Solution {
    public static void main(String[] args) {
        int[] temperature = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temperature)));
    }

    static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            int element = temperatures[i];
            while (!stack.isEmpty() && element >= temperatures[stack.peek()]) {
                stack.pop();
            }
            int ans = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
            answer[i] = ans;
        }
        return answer;
    }
}
