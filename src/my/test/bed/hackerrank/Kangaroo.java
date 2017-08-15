package my.test.bed.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/kangaroo
 */
public class Kangaroo {


    static String kangaroo(int x1, int v1, int x2, int v2) {

        if ((v2 > v1) && (x2 >= x1)) {
            return "NO";
        }

        if ((x1 == x2) && (v1 == v2)) {
            return "YES";
        }


        //(a1 − b1) + m(d1) + n(−d2)
        int term = 0;
        while (((x1 - x2) + (term * v1) + (term * (v2 -= (v2 * 2)))) != 0 ) {
            term++;
        }

        System.out.println(term);
        return "YES";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
