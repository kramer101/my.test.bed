package my.test.bed.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/array-left-rotation
 */
public class LeftRotation {

    private static int[] leftRotation(int[] a, int d) {
        // Complete this function

        if (d == 0) {
            return a;
        }

        int firstElement = a[0];
        //int[] temp = new int[a.length];

        /*
        int tempIndex = 0;
        for (int i = 1; i < a.length; i++) {
            temp[tempIndex] = a[i];
            tempIndex++;
        }
        */
        //System.arraycopy(a, 1, temp, 0, a.length - 1);
        System.arraycopy(a, 1, a, 0, a.length - 1);
        //temp[a.length - 1] = firstElement;
        a[a.length - 1] = firstElement;
        d--;
        //return leftRotation(temp, d);
        return leftRotation(a, d);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result =  a.length == d ? a : leftRotation(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
