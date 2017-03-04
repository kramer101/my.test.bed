package my.test.bed;

import java.util.Arrays;

public class QuickSortTest {

	public QuickSortTest() {
		
	}
	
	void sort(final int[] input, int start, int end) {
	
		int position = partition(input, start, end);
		
		if ((position - 1) > start) {
			sort(input, start, (position - 1));
		}
		
		if (position < end) {
			sort(input, position, end);
		}
		
	}
	
	
	public int partition(final int[] input, final int positionStart, final int positionEnd) {
		int pivotIndex = positionStart + (positionEnd - positionStart) / 2;
		
		int pivot = input[pivotIndex];
		System.out.println("pivot " + pivot);
		int leftPos = positionStart;
		int rightPos = positionEnd;
				
		while (leftPos <= rightPos) {
			while (input[leftPos] < pivot) {
				leftPos++;
			}
			
			while (input[rightPos] > pivot) {
				rightPos--;
			}
			
			if (leftPos <= rightPos) {
				int temp = input[rightPos];
				input[rightPos] = input[leftPos];
				input[leftPos] = temp;
				
				leftPos++;
				rightPos--;
			}
			
		}

		System.out.println(Arrays.toString(input));
		return leftPos;
	}
	

	
	public static void main(String[] args) {

		
		QuickSortTest sorter = new QuickSortTest();
		int[] array = {102,9,13,8,65,1,11};
		System.out.println(Arrays.toString(array));
		sorter.sort(array, 0, array.length - 1);
		
	}
}
