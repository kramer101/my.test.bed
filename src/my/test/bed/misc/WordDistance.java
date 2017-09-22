package my.test.bed.misc;

import org.apache.commons.lang3.StringUtils;

/**
 *
 */
public class WordDistance {


    public static void main(String[] args) {


        int distance = StringUtils.getLevenshteinDistance("cat", "cat");

        System.out.println(distance);

    }


}
