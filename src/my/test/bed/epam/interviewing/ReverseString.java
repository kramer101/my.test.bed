package my.test.bed.epam.interviewing;

/**
 * Created by vyakovlev on 3/28/17.
 */
public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello world";

        int start = 0;
        int end = str.length() - 1;
        char[] stringAsCharArray = str.toCharArray();

        while (end >= start) {
            char temp = stringAsCharArray[start];
            stringAsCharArray[start] = stringAsCharArray[end];
            stringAsCharArray[end] = temp;

            start++;
            end--;
        }

        System.out.println(new String(stringAsCharArray));

    }
}
