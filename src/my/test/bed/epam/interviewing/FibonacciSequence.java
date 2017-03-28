package my.test.bed.epam.interviewing;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by vyakovlev on 3/28/17.
 */
public class FibonacciSequence {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(getFibonacciSeq(30)));
    }

    static int[] getFibonacciSeq(final int limit) {
        int[] result = new int[limit];

        IntStream.range(0, limit).forEach((i) -> {
            int previous1 = 1;
            int previous2 = 0;

            if (i >= 2) {
                previous1 = result[i - 1];
                previous2 = result[i - 2];
            }

            result[i] = previous1 + previous2;
        });

        return result;
    }

}
