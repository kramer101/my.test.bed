package my.test.bed.epam.interviewing;

import java.util.Arrays;

/**
 * Created by vyakovlev on 3/23/17.
 */
public class AnagramCheck {



    public static void main(String[] args) {
        System.out.println(isAnagram("beat", "beta"));
        System.out.println(isAnagram("cat", "dog"));
    }


    /**
     *
     * Check if two strings are anagram of each other.
     * Example:
     * "beat" and "beta" are anagram
     */
    static boolean isAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();
        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);

        String sorted1 = new String(word1Chars);

        String sorted2 = new String(word2Chars);



        return sorted1.equals(sorted2);
    }
}
