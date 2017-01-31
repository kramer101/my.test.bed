package my.test.bed.misc.codebat;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 
 * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : 
 * {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

 * @author vyakovlev
 *
 */
public class SquareUp {

	public static int[] squareUp(int n) {

		List<Integer> masterList = new LinkedList<Integer>();
		for (int i = n; i > 0; i--) {
			masterList.add(i);
		}

		int[] resultArray = new int[n * n];
		int index = 0;

		for (int j = n - 1; j >= 0; j--) {

			List<Integer> part = new LinkedList<Integer>();
			part.addAll(masterList);

			for (int k = 0; k < j; k++) {
				part.set(k, 0);
			}

			for (Integer num : part) {
				resultArray[index] = num;
				index++;
			}

		}

		return resultArray;
	}

	public static void main(String[] args) {
		System.out.println(squareUp(3));
	}
}
