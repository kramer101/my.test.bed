package my.test.bed.misc.codebat;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 
 * 
 * Return an array that contains exactly the same numbers as the given array, but rearranged so that every 
 * 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. 
 * 
 * The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]


 * @author vyakovlev
 *
 */
public class FixThreeFour {

	public int[] fix34(int[] nums) {

		if (nums == null | nums.length == 0) {
			return new int[] {};
		}

		List<Integer> numsAsList = new LinkedList<Integer>();

		// fill out the list with the values in nums
		for (int i : nums) {
			numsAsList.add(i);
		}
		
		//initialize two lists to store the position of each 3 and 4 in nums
		List<Integer> positionsOfThrees = new LinkedList<Integer>();
		List<Integer> positionsOfFours = new LinkedList<Integer>();

		int replacementCount = 0;
		for (int i = 0; i < nums.length; i++) {
			int item = nums[i];
			
			//record position of a 3
			if (item == 3) {
				positionsOfThrees.add(i);
				replacementCount++;
			}

			//record position of a 4
			if (item == 4) {
				positionsOfFours.add(i);

			}

		}

		//replace 4 with the  item immediately right from the three
		//replace an item immediately right from the three with a four
		for (int i = 0; i < replacementCount; i++) {
			int three = positionsOfThrees.get(i);
			int four = positionsOfFours.get(i);

			int itemNextToThree = numsAsList.get(three + 1);
			numsAsList.set(four, itemNextToThree);
			numsAsList.set(three + 1, 4);

		}

		int[] result = new int[numsAsList.size()];

		for (int i = 0; i < numsAsList.size(); i++) {
			result[i] = numsAsList.get(i);
		}
		return result;
	}

}
