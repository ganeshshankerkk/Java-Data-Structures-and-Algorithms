package src.stack.problems.nextGreaterElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Leet Code 496 problem solution
 */
public class Solution {

    public static void main(String[] args) {
        int[] arrayOne = new int[]{4, 1, 2};
        int[] arrayTwo = new int[]{1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(arrayOne, arrayTwo)));
    }

    /**
     * Solution approach using
     * monotonic stack
     */
    static int[] nextGreaterElement(int[] arrayOne, int[] arrayTwo) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            int element = arrayTwo[i];
            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }
            int ans = stack.isEmpty() ? -1 : stack.peek();
            map.put(element, ans);
            stack.push(element);
        }
        int[] result = new int[arrayOne.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(arrayOne[i]);
        }
        return result;
    }

    /**
     * Basic approach using Arrays
     *//*
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] greaterNums = new int[nums1.length];
        Arrays.fill(greaterNums, -1);
        for (int i = 0; i < nums1.length; i++) {
            int nextGreatNumber = -1;
            boolean isSameElementPresent = false;
            for (int k : nums2) {
                if (nums1[i] == k && !isSameElementPresent) {
                    isSameElementPresent = true;
                    continue;
                }
                if (isSameElementPresent) {
                    if (k > nums1[i]) {
                        nextGreatNumber = k;
                        greaterNums[i] = nextGreatNumber;
                        break;
                    }
                }
            }

        }
        return greaterNums;
    }*/
}

