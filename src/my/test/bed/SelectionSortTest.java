package my.test.bed;

import java.util.Arrays;

public class SelectionSortTest {

	
	/**
	 * 
	 * The selection sort works as follows: you look through the entire array for the smallest element, 
	 * once you find it you swap it (the smallest element) with the first element of the array. 
	 * Then you look for the smallest element in the remaining array (an array without the first element) and swap it with the second element. 
	 * Then you look for the smallest element in the remaining array 
	 * (an array without first and second elements) and swap it with the third element, and so on.
	 * @param input
	 * @return
	 */
	public static int[] sort(final int[] input) {
		
		int[] result = input;
		for (int i = 0; i < result.length - 1; i++) {
			
			int smallestValue = Integer.MAX_VALUE;
			int smallestValueIndex = 0;
			
			int startValue = result[i];
			
			for (int j = i + 1; j < result.length; j++) {
				
				if (smallestValue > result[j]) {
					smallestValue = result[j];
					smallestValueIndex = j;
				}
			}
			

			if (startValue > smallestValue) {
				result[i] = smallestValue;
				result[smallestValueIndex] =  startValue;
				System.out.println(Arrays.toString(input));
			}
			
		}
		
		
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sort(new int[]{19, 900, 4, 11, 9, 5, 24, 3, 0, 34})));
		//System.out.println(Arrays.toString(sort(new int[]{6, 9, 5, 1, 4})));
		

		boolean b = false;
		int a = 1;
		char c = 'a';
		long l = 0L;
		short s = 0;
		
		double d = 0D;
		float f = 0.2345F;
		byte bt = 0;
		
		
		
	}
}
