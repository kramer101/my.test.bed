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
		int left = positionStart;
		int right = positionEnd;
				
		while (left <= right) {
			while (input[left] < pivot) {
				left++;
			}
			
			while (input[right] > pivot) {
				right--;
			}
			
			if (left <= right) {
				int temp = input[right];
				input[right] = input[left];
				input[left] = temp;
				
				left++;
				right--;
			}
			
		}

		System.out.println(Arrays.toString(input));
		return left;
	}
	

	
	public static void main(String[] args) {

		
		QuickSortTest sorter = new QuickSortTest();
		int[] array = {9,13,8,65,1,11};
		System.out.println(Arrays.toString(array));
		sorter.sort(array, 0, array.length - 1);
		
	}
}
