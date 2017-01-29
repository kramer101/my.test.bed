package my.test.bed.misc.codebat;

/**
 * 
 * 
Given a non-empty array, return true if there is a place to split the 
array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 * @author vyakovlev
 *
 */
public class CanBalance {

	public boolean canBalance(int[] nums) {

		if (nums == null || nums.length == 0) {
			return false;
		}

		int leftAmount = 0;

		for (int left = 0; left < nums.length; left++) {
			leftAmount = leftAmount + nums[left];
			int rightAmount = 0;
			for (int right = left + 1; right < nums.length; right++) {
				rightAmount = rightAmount + nums[right];

			}
			if (leftAmount == rightAmount) {
				return true;
			}

		}

		return false;
	}

}
