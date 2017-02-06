package my.test.bed;

import java.util.Arrays;

public class BubbleSortTest {

	
	public static int[] sort(final int[] input) {
		
		int[] result = input;
		
		
		boolean done = false;
		
		while (!done) { // * n-1
			
			boolean allSorted = true;
			for (int leftPos = 0; leftPos < result.length - 1; leftPos++) {
				
				int rigthPos = leftPos + 1; 
				
				int left = result[leftPos];
				int right = result[rigthPos];
				
				if (left > right) {
					result[leftPos] = right;
					result[rigthPos] = left;
					if (allSorted) {
						allSorted = false;
					}
				} 
			}
			
			done = allSorted;
			
			System.out.println(Arrays.toString(result) );
			
			
		}

		
		return result;
	}
	
	
	public static int[] sort2(int ar[]) {
		for (int i = (ar.length - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (ar[j - 1] > ar[j]) {
					int temp = ar[j - 1];
					ar[j - 1] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.println(Arrays.toString(ar));
		}
		
		return ar;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sort(new int[]{900, 4, 11, 9, 5, 24, 3})));
	}
	
}
