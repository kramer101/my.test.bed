package my.test.bed.epam.interviewing;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberDetector {

    public boolean isPrime(final int number) {

        if (number % 2 == 0) return false;

        for (int i = number - 1; i > 1; i--) {
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }



    public int[] populatePrimeNumbers(final int numberOfPrimesToReturn) {

        int[] result = new int[numberOfPrimesToReturn];
        populatePrimeNumbers(numberOfPrimesToReturn,
                result, 0, 2);

        return result;

       /* return IntStream.rangeClosed(0, number)
                .filter(this::isPrime)
                .toArray();*/

    }


    private void populatePrimeNumbers(final int numberOfPrimesToReturn,
                                      final int[] result, int positionIndex, int current) {

        if (positionIndex ==  numberOfPrimesToReturn) return;

        if (isPrime(current)) {
            result[positionIndex] = current;
            positionIndex++;
        }


        populatePrimeNumbers(
                numberOfPrimesToReturn, result, positionIndex, current + 1);


       /* return IntStream.rangeClosed(0, number)
                .filter(this::isPrime)
                .toArray();*/

    }



    @Test
    public void testPrimeNumbers() {
        int[] numbers = populatePrimeNumbers(30);
        Assert.assertNotNull(numbers);
        Assert.assertEquals(30, numbers.length);
    }

    @Test
    public void testPrimeNumberDetection() {

        PrimeNumberDetector primeNumberDetector = new  PrimeNumberDetector();

        Assert.assertTrue(primeNumberDetector.isPrime(13));
        Assert.assertFalse(primeNumberDetector.isPrime(15));

    }
}
