package my.test.bed.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/between-two-sets
 */
public class BetweenTwoSets {


    static int getTotalX(int[] a, int[] b) {

        int count = 0;
        for (int xValue = 1; xValue <= 100; xValue++) {

            boolean aIsBetween = false;
            boolean bIsBetween = false;
            for (int aValue : a) {
                if ((xValue % aValue) == 0) {
                    count++;
                }
            }

            for (int bValue : b) {
                if ((bValue % xValue) == 0) {
                    count++;
                }
            }
        }


        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
