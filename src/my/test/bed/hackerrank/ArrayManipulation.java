package my.test.bed.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/crush/problem
 *
 * 5 3
 1 2 100
 2 5 100
 3 4 100
 */
public class ArrayManipulation {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int numberOfLines = in.nextInt();
        long[] array = new long[arraySize];
        long max = 0;

        long minStart = 0;
        long maxEnd = Long.MAX_VALUE;
        int addition = 0;
        for(int a0 = 0; a0 < numberOfLines; a0++) {
            int start = in.nextInt();
            int end = in.nextInt();
            addition += in.nextInt();

            System.out.println(start  + " " + end);
            /*for (int i = (start - 1); i <= (end - 1); i++) {
                array[i] = array[i] + addition;
                if (array[i] > max) max = array[i];
            }*/

            //System.out.println(Arrays.toString(array));
            //System.out.println(max);

        }



        System.out.println(addition);
        System.out.println(max);
        in.close();
    }
}
