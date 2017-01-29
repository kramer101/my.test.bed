package my.test.bed.misc.codebat;

/**
 * Given an array of ints, return true if every element is a 1 or a 4.
 * 
 * only14([1, 4, 1, 4]) → true only14([1, 4, 2, 4]) → false only14([1, 1]) →
 * true
 * 
 * @author vyakovlev
 *
 */
public class OnlyOneOrFour {

	public static boolean only14(int[] nums) {

		if (nums == null || nums.length == 0) {
			return true;
		}

		//in this case sorting slows things down a lot
		/*Arrays.sort(nums);

		if (nums[0] > 4 || nums[nums.length - 1] > 4) {
			return false;
		}
*/
		//better without sorting
		
		
		
		boolean isAllCorrectNumbers = true;
		int i = 0;
		for (; i < nums.length; i++) {

			if (nums[i] != 1 && nums[i] != 4) {
				isAllCorrectNumbers = false;
			}

		}

		System.out.println("i=" + i);
		return isAllCorrectNumbers;

	}

	
	public static void main(String[] args) {
		int size = 1000000;
		
		int[] array = new int[size + 2];
		for (int i = 0; i < size; i++) {
			/*if (i == 0) {
				array[i] = 0;
			}*/
			if (i < size/2) {
				array[i] = 1;
			} else {
				array[i] = 4;
			}
			
		}
		array[size+1] = 5;
		
		System.out.println("array is ready , length = " + array.length);
		long msStart = System.currentTimeMillis();
		System.out.println(only14(array));
		
		long msDuration = System.currentTimeMillis() - msStart;
		System.out.println("Completed in " + msDuration + "ms");
		
	}
}
