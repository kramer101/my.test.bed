package my.test.bed.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 */
public class WordDistance {


    public static void main(String[] args) {


        int distance = getWordDistance("cat", "cattsz");
                //StringUtils.getLevenshteinDistance("cat", "cat");

        System.out.println(distance);

    }



    private static int getWordDistance(final String wordOne, final String wordTwo) {

        Objects.requireNonNull(wordOne);
        Objects.requireNonNull(wordTwo);

        int lengthDiff = Math.abs(wordOne.length() - wordTwo.length());
        int distance = 0;

        char[] arrayOneSorted = wordOne.toCharArray();
        Arrays.sort(arrayOneSorted);

        char[] arrayTwoSorted = wordTwo.toCharArray();
        Arrays.sort(arrayTwoSorted);


        if (lengthDiff == 0) { //simple case
            int iterationLength = Math.min(wordOne.length(), wordTwo.length());
            for (int i = 0; i < iterationLength; i++) {
                if (arrayOneSorted[i] != arrayTwoSorted[i]) {
                    distance++;
                }
            }

        } else {

            //calculate symmetric difference and return the size.
            List<Character> listOne  = IntStream.range(0, arrayOneSorted.length)
                   .mapToObj(value -> arrayOneSorted[value]).collect(Collectors.toList());
            List<Character> listTwo = IntStream.range(0, arrayTwoSorted.length)
                    .mapToObj(value -> arrayTwoSorted[value]).collect(Collectors.toList());

            List<Character> result  = new ArrayList<>();
            result.addAll(listOne);
            result.addAll(listTwo);

            List<Character> intersection = new ArrayList<>();
            intersection.addAll(listOne);
            intersection.retainAll(listTwo);

            result.removeAll(intersection);

            distance = result.size();

        }

        return distance;

    }

}
