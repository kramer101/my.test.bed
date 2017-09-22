package my.test.bed.misc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 */
public class BinarySearch {


    public static void main(String[] args) {

        int a[][] = {{12, 13, 14, 15, 16}, {111, 112, 113}, {222, 223, 224}};

        int value = 16;

        boolean contains = false;
        for (int i[] : a) {
            if (contains(i, value)) {
                contains = true;
                break;
            }
        }

        System.out.println(contains);

        List<String> list1 = new LinkedList<>();



    }

    static boolean contains(int a[], int value) {


        int min = a[0];
        int max = a[a.length - 1];

        return value >= min && value <= max;
    }


    public int find(int[] array, int numToFind) {

        Arrays.sort(array);

        if (numToFind < array[0] && numToFind > array[array.length - 1]) return -1;

        int lower = 0;
        int upper = array.length - 1;


        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            int middleValue = array[middle];
            if (numToFind == middleValue) return middle;

            if (numToFind > middleValue) {
                lower = middle + 1;
            } else if (numToFind < middleValue) {
                upper = middle - 1;
            } else {
                return middle;
            }

        }
        return -1;

    }



    @Test
    public void testSearch() {
        BinarySearch search = new BinarySearch();

        int size = 20000;

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = Math.abs(random.nextInt() / 1000);
        }

        int result = find(array, array[30]);
        Assert.assertTrue(result != -1);

    }

}
