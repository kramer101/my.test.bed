package my.test.bed.epam.interviewing;

import com.google.common.collect.Sets;

import java.math.BigInteger;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by vyakovlev on 3/23/17.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialOf2(510));
    }



    static BigInteger factorialOf(final int number) {

        BigInteger result = BigInteger.ONE;


        for (int i = 1; i <= number; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }

        return result;

    }


    static BigInteger factorialOf2(final int number) {
        Set<Integer> numbers = Sets.newLinkedHashSet();
        IntStream.range(2, number + 1).forEach(numbers::add);

        return numbers.stream()
                .map(integer -> new BigInteger(String.valueOf(integer)))
                .reduce(BigInteger::multiply)
                        .orElseGet(() -> BigInteger.ZERO);
    }
}
