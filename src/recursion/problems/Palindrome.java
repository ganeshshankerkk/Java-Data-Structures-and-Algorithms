package src.recursion.problems;

/**
 * <p>
 * Implement a recursive function to calculate if a given string is palindrome.
 * </p>
 * <p>
 * Input: java
 * </p>
 * <p>
 * Output: false
 * </p>
 * <p>
 * Input: Bob
 * </p>
 * <p>
 * Output: true
 * </p>
 *
 */
public class Palindrome {

	public static void main(String[] args) {
		String[] inputs = new String[] { "java", "malayalam", "engineer", "software", "rotator", "reversal",
				"Sample text", "Bob", "This is a dummy line", "Recursion", "A", "" };
		for (String input : inputs) {
			System.out.println("Is \"" + (input.isEmpty() ? "" : input) + "\" Palindrome: " + isPalindrome(input));
		}

	}

	static boolean isPalindrome(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return true;
		}
		str = str.toLowerCase();
		return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length() - 1));
	}
}
