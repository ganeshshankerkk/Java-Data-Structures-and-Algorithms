package src.recursion.problems;

/**
 * Implement a recursive function to print the reverse of a given string
 * Input: java
 * Output: avaj
 */
public class Reverse {
    public static void main(String[] args) {
        String[] reverseTexts = new String[]{"java", "malayalam", "engineer", "software", "reversal", "Sample text", "This is a dummy line", "Recursion", "A", ""};
        for (String str : reverseTexts) {
            System.out.println("Reverse of " + (str.isEmpty() ? "" : str) + " is \"" + reverse(str) + "\"");
        }
    }

    static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return str.substring(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
