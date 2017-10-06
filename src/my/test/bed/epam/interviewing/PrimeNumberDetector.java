package my.test.bed.epam.interviewing;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberDetector {

    public boolean isPrime(final int number) {

        if (number % 2 == 0) return false;

        for (int i = number -1; i > 1; i--) {
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }


    @Test
    public void testPrimeNumberDetection() {

        PrimeNumberDetector primeNumberDetector = new  PrimeNumberDetector();

        Assert.assertTrue(primeNumberDetector.isPrime(13));
        Assert.assertFalse(primeNumberDetector.isPrime(15));

    }
}
