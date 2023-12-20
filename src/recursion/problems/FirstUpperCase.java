package src.recursion.problems;

/**
 * implement a recursive function that returns the first upper case character
 * from a String
 *
 */
public class FirstUpperCase {

	public static void main(String[] args) {
		String[] input = new String[] { "Java", "malayalam", "sample Text", "A", "", "linkedList", "    ",
				"  reactJS  ", "1", "a" };
		for (String str : input) {
			System.out.println(str + " : " + firstUpperCaseCharacter(str));
		}

	}

	static char firstUpperCaseCharacter(String str) {
		if (str.trim().length() == 0) {
			return Character.MIN_VALUE;
		}
		if (Character.isUpperCase(str.charAt(0))) {
			return str.charAt(0);
		}
		return firstUpperCaseCharacter(str.trim().substring(1));
	}

}
