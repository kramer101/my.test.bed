package my.test.bed.hackerrank;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort1
 */
public class QuickSort1Partition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            array.add(scanner.nextInt());
        }

        int pivot = array.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        array.forEach(integerParam -> {
            if (integerParam < pivot) {
                left.add(integerParam);
            } else if (integerParam > pivot) {
                right.add(integerParam);
            } else if (integerParam == pivot) {
                equal.add(integerParam);
            }
        });

        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);

        System.out.println(Joiner.on(" ").join(result));

    }




    private void partition(final int[] array) {




    }

}
