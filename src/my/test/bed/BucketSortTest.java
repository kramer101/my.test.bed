package my.test.bed;

import java.util.Arrays;

public class BucketSortTest {

	
	
	//PROBLEM HERE: how to deal with the duplicates? Linked lists
	public static int[] sort(final int[] input) {
		
		int[] temp = new int[0];
		
		for (int i = 0; i < input.length; i++) {
			
			if (temp.length < input[i]) {
				int[] temp2 = new int[input[i]];
				for (int j = 0; j < temp.length; j++) {
					temp2[j] = temp[j];
				}
				temp = temp2;
			}
			
			temp[input[i] - 1] = input[i];
		}
		
		int[] result = new int[input.length];
		
		int resultIndex = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0) {
				result[resultIndex] = temp[i];
				resultIndex++;
			}
			
		}
		
		return result;
	}
	
	
	public static void main(final String[] args) {
		System.out.println(Arrays.toString(sort(new int[]{1000, 5, 8, 10, 3, 44, 1, 2, 58})));
	}
}
