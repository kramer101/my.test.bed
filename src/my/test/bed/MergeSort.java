package my.test.bed;

import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Test;

public class MergeSort {


    public static void main(String[] args) {

        int[] array = {200, 14, 7, 3, 12, 9, 11, 6, 2, 890, 4, 100, 68, 201};
        int[] result = sort(array);

        IntStream.of(result).forEach(value -> System.out.print(value + " "));
    }

    private static int[] sort(int[] array) {

        if (array.length == 1) {
            return array;
        }

        if (array.length == 2) {
            if (array[0] > array[1]) {
                int temp = array[1];
                array[1] = array[0];
                array[0] = temp;
            }
            return array;
        }


        //divide and sort
        int middlePos = (array.length / 2);
        int[] sub1 = new int[middlePos + 1];
        int[] sub2 = new int[array.length - sub1.length];

        System.arraycopy(array, 0, sub1, 0, sub1.length);
        System.arraycopy(array, middlePos + 1, sub2, 0, sub2.length);

        sub1 = sort(sub1);
        sub2 = sort(sub2);

        //merge the resulted two arrays
        return merge(sub1, sub2);

    }



    private static int[] merge(int[] subArray1, int[] subArray2) {
        int[] result = new int[subArray1.length + subArray2. length];

        int countSelected = 0;
        int a = 0; //position in subArray1
        int b = 0; //position in subArray2
        int resultPosition = 0;

        int value1 = 0;
        int value2 = 0;

        while (countSelected < result.length) {

            if (a >= subArray1.length) {
                System.arraycopy(subArray2, b, result, a + b, subArray2.length - b);
                break;
            }

            if (b >= subArray2.length) {
                System.arraycopy(subArray1, a, result, a + b, subArray1.length - a);
                break;
            }

            value1 = subArray1[a];
            value2 = subArray2[b];


            if (value1 > value2) {
                result[resultPosition] = value2;
                countSelected++;
                b++;
            }


            if (value2 > value1) {
                result[resultPosition] = value1;
                countSelected++;
                a++;

            }

            resultPosition++;
        }

        return result;
    }

    @Test
    public void testMerge() {

        int[] test1 = {3,7,14};
        int[] test2 = {9,12};

        int[] result = merge(test1, test2);
        Assert.assertEquals(test1.length + test2.length, result.length);



    }

}
