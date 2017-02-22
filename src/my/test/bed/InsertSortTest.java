package my.test.bed;

import java.util.Arrays;

public class InsertSortTest {

	
	/*public static int[] sort(int[] numbers, int first, int last) {
	
		if (first >= last) {
			return numbers;
		}
		int largest = 0;
		int smallest = Integer.MAX_VALUE;
		
		int largestPosition = 0;
		int smallestPosition = 0;
		
		for (int i = first; i <= last; i++) {
			int number = numbers[i];
			if (largest < number) {
				largest = number;
				largestPosition = i;
			}
			
			if (smallest > number) {
				smallest = number;
				smallestPosition = i;
			}
		}
		
		int tempFirst = numbers[first];
		int tempLast = numbers[last];
				
		numbers[first] = smallest;
		numbers[last] = largest;
		
		numbers[smallestPosition] = tempFirst;
		numbers[largestPosition] = tempLast;
		
		return sort(numbers, first + 1, last -1);
	}
	*/
	
	public static int[] sort(int[] numbers) {
		
		for (int i = 1; i < numbers.length; i++) {
			
			int j = i;
			int currentPositionValue = numbers[i];
			System.out.println(Arrays.toString(numbers) + "; i=" + i + "; currentPositionValue=" + currentPositionValue);
			
			while (j > 0 && numbers[j - 1] > currentPositionValue) {
				
				System.out.println(">>" + " numbers[j]=" + numbers[j] + "; numbers[j-1]=" + numbers[j - 1]);
				numbers[j] = numbers[j - 1];
				j--;
			}
			
			numbers[j] = currentPositionValue;
			
		}
		
		return numbers;
		
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[]{4, 11, 9, 5, 24, 3, 900};
		
		//System.out.println(Arrays.toString(sort(numbers, 0, numbers.length - 1)));
		System.out.println(Arrays.toString(sort(numbers)));
	}
}
