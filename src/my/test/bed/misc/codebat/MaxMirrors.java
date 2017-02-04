package my.test.bed.misc.codebat;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 
 * We'll say that a "mirror" section in an array is a group of contiguous
 * elements such that somewhere in the array, the same group appears in reverse
 * order.
 * 
 * For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length
 * 3 (the {1, 2, 3} part). Return the size of the largest mirror section found
 * in the given array.
 * 
 * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3 maxMirror([1, 2, 1, 4]) → 3
 * maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
 * 
 * @author vyakovlev
 *
 */
public class MaxMirrors {

	public int maxMirror(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		List<Integer> reversed = new LinkedList<Integer>();
		for (int i = nums.length - 1; i >= 0; i--) {
			reversed.add(nums[i]);
		}

		int max = 0;

		List<Integer> tempList = new LinkedList<Integer>();
		for (int start = 0; start < nums.length; start++) {

			int end = start + 1;

			while (end <= nums.length) {
				tempList.clear();

				for (int j = start; j < end; j++) {
					tempList.add(nums[j]);
				}

				String subString = tempList.toString();
				subString = subString.replace("[", "");
				subString = subString.replace("]", "");
				if (reversed.toString().contains(subString)) {
					if (tempList.size() > max) {
						max = tempList.size();
					}
				}

				end++;
			}

		}

		return max;
	}

}
