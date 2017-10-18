package my.test.bed.epam.interviewing;

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


    public Double divide(final Double dividend, final Double divisor) {
        Objects.requireNonNull(dividend);
        Objects.requireNonNull(divisor);
        if (divisor == 0) {
            throw new UnsupportedOperationException("cannot divide by 0");
        }


        return dividend / divisor;
    }



}
