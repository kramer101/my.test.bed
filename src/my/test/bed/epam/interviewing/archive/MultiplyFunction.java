package my.test.bed.epam.interviewing.archive;


import org.junit.Assert;
import org.junit.Test;

/**
 * Write a multiply function that multiples 2 integers without using the multiply sign *
 */
public class MultiplyFunction {




    public static int multiply(int factor1, int factor2) {

        int result = 0;
        for (int i = 0; i < factor1; i++) {
            result = result + factor2;
        }

        return result;
    }


    @Test
    public void testMultiplication() {
        int result = multiply(10, 10);
        Assert.assertEquals(100, result);
    }

}
