package my.test.bed.epam.interviewing;

import java.util.Arrays;

/**
 * reverse an array of int's in-place in a single iteration.
 */
public class ReverseArrayOfNumbersInPlace {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            int end = (array.length - 1) - i;
            if (i >= end) break;
            int temp = array[i];
            array[i] = array[end];
            array[end] = temp;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(array instanceof Object);
    }
}
