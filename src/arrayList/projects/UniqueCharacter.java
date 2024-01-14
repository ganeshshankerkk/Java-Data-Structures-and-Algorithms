package src.arrayList.projects;

import java.util.*;

/**
 * Leetcode problem 387 solution
 * Given a string s, find the first non-repeating character in it
 * and return its index.If it does not exist, return -1.
 *
 * @see <a href="https://leetcode.com/problems/first-unique-character-in-a-string/description/">First Unique Character in a String</a>
 */
public class UniqueCharacter {
    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        inputs.add("leetcode");
        inputs.add("loveleetcode");
        inputs.add("aabb");
        inputs.add("java");
        for (String input : inputs) {
            System.out.println("First unique character index in \"" + input + "\" is " + firstUniqueChar(input));
        }
    }

    /**
     * Solution one
     *
     * @param s a non-nullable string
     * @return index of first unique character in the String
     */
    static int firstUniqueChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int character = s.charAt(i);
            if (s.lastIndexOf(character) == i && s.indexOf(character) == i) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Solution two using Hashmap
     *
     * @param s a non-nullable string
     * @return index of first unique character in the String
     */
    static int firstUniqueCharacter(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                int val = charMap.get(s.charAt(i));
                val++;
                charMap.put(s.charAt(i), val);
            } else {
                charMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i)) && charMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
