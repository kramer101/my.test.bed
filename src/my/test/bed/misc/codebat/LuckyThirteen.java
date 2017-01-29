package my.test.bed.misc.codebat;

import java.util.Arrays;

/**
 * 
 * 
Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 * @author vyakovlev
 *
 */
public class LuckyThirteen {

	
	/**
	 * Using binary search. 
	 * @param nums
	 * @return
	 */
	public boolean lucky13(int[] nums) {
		if (nums == null || nums.length == 0) {
			return true;
		}

		//must sort first before using binarySearch()
		Arrays.sort(nums);

		if (Arrays.binarySearch(nums, 1) < 0 && Arrays.binarySearch(nums, 3) < 0 && Arrays.binarySearch(nums, 13) < 0) {
			return true;
		}

		return false;

	}
	
	
	/**
	 * Using simple iteration. Supposedly faster O(n).
	 * @param nums
	 * @return
	 */
	public boolean lucky13_2(int[] nums) {
		  if (nums == null || nums.length == 0) {
		    return true;
		  }
		  
		  
		  
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] == 1 || nums[i] == 3) {
		      return false;
		    }
		  }
		 
		  return true;
		  
		}


}
