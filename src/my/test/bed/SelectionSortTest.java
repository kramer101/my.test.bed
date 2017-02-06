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
		for (int i = 0; i < result.length; i++) {
			
			int smallestValue = Integer.MAX_VALUE;
			int smallestValueIndex = 0;
			for (int j = i; j < result.length; j++) {
				if (smallestValue > result[j]) {
					smallestValue = result[j];
					smallestValueIndex = j;
				}
			}
			
			int startValue = result[i];
			result[i] = smallestValue;
			result[smallestValueIndex] =  startValue;
		}
		
		
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sort(new int[]{9, 900, 4, 11, 9, 5, 24, 3, 0})));
		
		StringBuilder sb = new StringBuilder("abc");
		
		System.out.println((5-5+6));
		
		char c = Character.MIN_VALUE;
		
	}
}
