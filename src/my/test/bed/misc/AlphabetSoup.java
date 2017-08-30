package my.test.bed.misc;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSoup {



    public static String AlphabetSoup(String str) {

        char[] sorted = str.toCharArray();
        Arrays.sort(sorted);


        return new String(sorted);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(AlphabetSoup(s.nextLine()));
    }


}
