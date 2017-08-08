package my.test.bed.hackerrank;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange
 */
public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        List<Integer> applesOnHouse =
            IntStream.of(apple).filter(
                    value -> (a + value) >= s && (a + value) <= t).boxed().collect(Collectors.toList());

        List<Integer> orangesOnHouse =
                IntStream.of(orange).filter(
                        value ->
                        {
                            if (value < 0) {
                                value = Math.abs(value);
                                return (b - value) >= s && (b - value) <= t;
                            } else return false;

                        }).boxed().collect(Collectors.toList());

        System.out.println(applesOnHouse.size());
        System.out.println(orangesOnHouse.size());

    }

}
