package src.stack.problems.logFolder;

import java.io.*;
import java.util.*;

/**
 * Leet Code 1598 problem solution
 * "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
 * "./" : Remain in the same folder.
 * "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
 * You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
 * The file system starts in the main folder, then the operations in logs are performed.
 * Return the minimum number of operations needed to go back to the main folder after the change folder operations.
 *
 * @see <a href="https://leetcode.com/problems/crawler-log-folder/description/">Crawler Log Folder</a>
 */
public class Solution {
    public static void main(String[] args) {

        String fileName = "./src/stack/problems/logFolder/paths.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Minimum operations required: " + getMinimumOperations(line.split(",")));
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }

    /**
     * @param logs List of operations performed by the user
     * @return minimum number of operations needed to go back to
     * the main folder after the change folder operations
     */
    static int getMinimumOperations(String[] logs) {
        Stack<String> directory = new Stack<>();
        for (String log : logs) {
            if (log.equals("../") && !directory.isEmpty()) {
                directory.pop();
            } else if (!log.equals("./")) {
                directory.push(log);
            }
        }
        return directory.size();
    }
}
