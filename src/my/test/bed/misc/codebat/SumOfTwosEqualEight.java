package my.test.bed.misc.codebat;

import java.util.Arrays;

/**
 * 
 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false

 * @author vyakovlev
 *
 */
public class SumOfTwosEqualEight {

	public boolean sum28(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}

		Arrays.sort(nums); //by sorting the array we get all numbers sorted from small to large (asc.)

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > 2) {
				if (sum == 8) {
					//since the array is sorted, we know that there won't be any more 2's in the array once we exceed the value of 2 
					//so if by this time we have exactly the sum of eight, there is NO need for further iteration, we can return true.
					return true;
				}

			} else if (nums[i] == 2) {
				//if we haven't exceeded the value of 2 yet, IF this value==2, then add it to the sum.
				sum += nums[i];

			}

		}

		if (sum == 8) {
			
			return true;
		}

		return false;

	}

}
