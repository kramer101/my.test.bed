package my.test.bed.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/sparse-arrays
 *
 * 4
 aba
 baba
 aba
 xzxb
 3
 aba
 xzxb
 ab4
 aba
 baba
 aba
 xzxb
 3
 aba
 xzxb
 ab
 */
public class SparseArrays {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linesCount = scanner.nextInt();

        Map<String, Integer> index = new HashMap<>();
        
        for (int i = 0; i < linesCount; i++) {
            String line = scanner.next();
            if (index.containsKey(line)) {
                index.put(line, index.get(line) + 1);
            } else {
                index.put(line, 1);
            }
        }
        

        int queriesCount = scanner.nextInt();


        for (int i = 0; i < queriesCount; i++) {
            String query = scanner.next();
            Integer count = index.get(query);

            if (count != null) {
                System.out.println(count);
            } else {
                System.out.println(0);
            }

        }

    }
}
