package my.test.bed.epam.interviewing;

/**
 * Created by vyakovlev on 3/20/17.
 */
public class PalindromeDetector {


    private static boolean isPalindrome(final String word) {

        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        return word.equals(reversed);

    }


    private static boolean isPalindrome2(final String wordParam) {

        char[] word = wordParam.toCharArray();
        int start = 0;
        int end = word.length - 1;

        while (end >= start) {

            if (word[start] != (word[end])) {
                return  false;
            }

            start++;
            end--;

        }

        return true;
    }




    public static void main(String[] args) {


        //System.out.println(isPalindrome("madam"));

        System.out.println(isPalindrome2("abba"));

    }
}
