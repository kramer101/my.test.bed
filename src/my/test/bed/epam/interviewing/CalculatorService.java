package my.test.bed.epam.interviewing;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

/**
 * Assign this simple test to a candidate
 * to check coding quality skills.
 *
 * Expected: code and tests are written using best practices for clean code
 */
public class CalculatorService {

    public Double multiply(final Double value1, final Double value2) {

        Objects.requireNonNull(value1);
        Objects.requireNonNull(value2);


        return value1 * value2;

    }


    //Implement JUnit tests.
    //Requirements:
    //-must perform the division correctly
    //-must never return null
    //-if any argument is null, the method must throw an exception with a user friendly message "argument must not be null"
    //-if divisor is 0, then the method must throw a UnsupportedOperationException with a user friendly message "cannot divide by 0"
    //-if dividend is 0, then the result should be 0.
    public Integer divide(final Integer dividend, final Integer divisor) {

        Objects.requireNonNull(dividend, "argument must not be null");
        Objects.requireNonNull(divisor, "argument must not be null");
        if (dividend == 0) return 0;
        if (divisor == 0) {
            throw new UnsupportedOperationException("cannot divide by 0");
        }



        return dividend / divisor;
    }



    @Test
    public void testDivide() {
        CalculatorService service = new CalculatorService();
        Integer result = service.divide(10, 5);
        Assert.assertNotNull(result);

    }

}
