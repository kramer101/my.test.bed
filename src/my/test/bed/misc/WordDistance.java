package my.test.bed.misc;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Objects;

/**
 * Minimum edit distance problem.
 */
public class WordDistance {


    public static void main(String[] args) {

        String w1 = "cat";//RandomStringUtils.randomAlphabetic(100);
        String w2 = "tac";//w1 + "x";//RandomStringUtils.randomAlphabetic(100);

        long start1 = System.currentTimeMillis();
        int distance = getWordDistance(w1, w2);
        long time1 = System.currentTimeMillis() - start1;
        System.out.println("distance " + distance + ", " + time1 + "ms");

        long start2 = System.currentTimeMillis();
        int levenshteinDistance = StringUtils.getLevenshteinDistance(w1, w2);
        long time2 = System.currentTimeMillis() - start2;

        System.out.println("levenshteinDistance " + levenshteinDistance + ", " + time2 + "ms");

    }




    private static int getWordDistance(final String wordOne, final String wordTwo) {
        Objects.requireNonNull(wordOne);
        Objects.requireNonNull(wordTwo);

        int lengthDiff = Math.abs(wordOne.length() - wordTwo.length());
        int distance = 0;

        char[] arrayOneSorted = wordOne.toLowerCase().toCharArray();
        Arrays.sort(arrayOneSorted);

        char[] arrayTwoSorted = wordTwo.toLowerCase().toCharArray();
        Arrays.sort(arrayTwoSorted);

        /*int iterationLength = Math.max(wordOne.length(), wordTwo.length());

        Set<Character> charSet = new LinkedHashSet<>();

        for (int i = 0; i < iterationLength; i++) {
            Character characterOne = getChar(arrayOneSorted, i);
            Character characterTwo = getChar(arrayTwoSorted, i);

            if (characterOne == null || characterTwo == null) { //addition
                distance++;
            }

            if (characterOne != characterTwo) { //substitution
                distance++;
            }

            charSet.add(characterOne);
            charSet.add(characterTwo);
        }*/

        /*Set<Character> setOne = wordOne.chars().sorted()
                .mapToObj(value -> ((char) value)).collect(Collectors.toSet());

        Set<Character> setTwo = wordTwo.chars().sorted()
                .mapToObj(value -> ((char) value)).collect(Collectors.toSet());

        List<Character> result  = new LinkedList<>();
        result.addAll(setOne);
        result.addAll(setTwo);

        List<Character> intersection = new LinkedList<>();
        intersection.addAll(setOne);
        intersection.retainAll(setTwo);

        result.removeAll(intersection);


        distance = result.size();*/


        return distance;

    }

    private static Character getChar(char[] chars, int position) {
        if (position >= chars.length) return null;

        return chars[position];
    }

}
