package my.test.bed.epam.interviewing;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class PermutationsOfString {


    public Set<String> getPermutations(String word) {
        Set<String> result = new LinkedHashSet<>();

        //swap(word, "", "", result);

        for (int i = 0; i < word.length() - 1 ; i++) {

            result.add(swap(word, result));
            word =  word.substring(1, word.length()) + word.charAt(0);


        }

        return result;

    }


    private String swap(String word, Set<String> result) {

        String left = word.substring(0, 1);
        String right = word.substring(1, word.length());

        while (left.length() < word.length()) {
            left = left +
                    right.charAt(right.length() - 1);
            right = right.substring(0, right.length() - 1);

            result.add(left + right);

        }

        if (left.equals(word)) {
            return left;
        } else  {
            return swap(left, result);
        }
    }

    @Test
    public void testPermutations() {

        System.out.println(
        this.getPermutations("god"));

    }

}
