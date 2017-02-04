package my.test.bed.misc.codebat;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3
 * .. n} (spaces added to show the grouping). Note that the length of the array
 * will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
 * 
 * seriesUp(3) → [1, 1, 2, 1, 2, 3] seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 * seriesUp(2) → [1, 1, 2]
 * 
 * 
 * @author vyakovlev
 *
 */
public class SeriesUp {

	public int[] seriesUp(int n) {

		int targetSize = n * (n + 1) / 2;

		int[] resultArray = new int[targetSize];
		if (n == 0) {
			return resultArray;
		}

		List<Integer> seriesList = new LinkedList<Integer>();

		int indexInResultArray = 0;
		while (seriesList.size() != n) {

			seriesList.add(seriesList.size() + 1);

			for (int i = 0; i < seriesList.size(); i++) {
				resultArray[indexInResultArray] = seriesList.get(i);
				indexInResultArray++;
			}

		}

		return resultArray;

	}

}
