package src.stack.problems.baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Leet Code 682 problem solution
 * @see <a href="https://leetcode.com/problems/baseball-game/description/">Baseball Game</a>
 */
public class Solution {
    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        inputs.add("1,C");
        inputs.add("5,-2,4,C,D,9,+,+");
        inputs.add("5,2,C,D,+");

        for (String input : inputs) {
            System.out.println("calPoints: " + calPoints(input.split(",")));
        }
    }

    static int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        int totalScore = 0;
        for (String operation : operations) {
            switch (operation) {
                case "+":
                    if (!scores.isEmpty()) {
                        int top = scores.peek();
                        int secondTop = 0;
                        if (!scores.isEmpty()) {
                            scores.pop();
                            secondTop = scores.isEmpty() ? 0 : scores.peek();
                        }
                        scores.push(top);
                        scores.push(top + secondTop);
                    }
                    break;
                case "D":
                    if (!scores.isEmpty()) {
                        scores.push(scores.peek() * 2);
                    }
                    break;
                case "C":
                    if (!scores.isEmpty()) {
                        scores.pop();
                    }
                    break;
                default:
                    scores.push(Integer.valueOf(operation));
                    break;
            }
        }

        for (int score : scores) {
            totalScore += score;
        }
        return totalScore;
    }
}
