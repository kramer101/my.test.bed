package my.test.bed.misc.codebat;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * (This is a slightly harder version of the fix34 problem.) 
 * 
 * Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is 
 * immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, 
 * and every 4 has a number after it that is not a 4. 
 * 
 * In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
 * @author vyakovlev
 *
 */
public class FixFourFive {

	public int[] fix45(int[] nums) {

		if (nums == null | nums.length == 0) {
			return new int[] {};
		}

		List<Integer> numsAsList = new LinkedList<Integer>();

		// fill out the list
		for (int i : nums) {
			numsAsList.add(i);
		}

		List<Integer> positionsOfFourth = new LinkedList<Integer>();
		List<Integer> positionsOfFives = new LinkedList<Integer>();

		int replacementCount = 0;
		for (int i = 0; i < nums.length; i++) {
			int item = nums[i];
			if (item == 4) {
				positionsOfFourth.add(i);
				replacementCount++;
			}

			if (item == 5) {
				positionsOfFives.add(i);
			}

		}

		for (int i = replacementCount - 1; i >= 0; i--) {
			int four = positionsOfFourth.get(i);
			int five = positionsOfFives.get(i);

			int itemNextToFour = numsAsList.get(four + 1);
			
			//same as in FixThreeFour, but if an item next to four is five, then
			//we can't use it. Instead we reverse the list of positions of fives and move on
			//in such case on the next iteration, a five will be taken from position that is NOT next to four
			if (itemNextToFour == 5) {
				Collections.reverse(positionsOfFives);
			} else {

				// swap
				numsAsList.set(five, itemNextToFour);
				numsAsList.set(four + 1, 5);
			}

		}

		int[] result = new int[numsAsList.size()];

		for (int i = 0; i < numsAsList.size(); i++) {
			result[i] = numsAsList.get(i);
		}
		return result;

	}

}
