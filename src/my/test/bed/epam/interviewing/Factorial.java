package my.test.bed.epam.interviewing;

import java.math.BigInteger;

/**
 * Created by vyakovlev on 3/23/17.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialOf(100));
    }



    static BigInteger factorialOf(final int number) {

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }

        return result;

    }
}
