package my.test.bed.misc;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceInArrays {

	
	
	private static Set<Integer> diff(int[] array1, int[] array2) {
		Set<Integer> result = new HashSet<>();
		
		//get union
		int last = 0;
		
		int[] union = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i ++) {
			union[i] = array1[i];
			last = i;
		}
		last = last + 1;
		for (int i = 0; i < array2.length; i++) {
			union[last + i] = array2[i];
		}
		
		
		//get intersection
		int[] intersection = new int[0];
		
		for (int i = 0; i < array1.length; i++) {
			int array1Value = array1[i];
			
			for (int j = 0; j < array2.length; j++) {
				int array2Value = array2[j];
				if (array1Value == array2Value) {
					int[] temp = new int[intersection.length + 1];
					
					for (int k = 0; k < intersection.length; k++) {
						temp[k] = intersection[k];
					}
					temp[temp.length - 1] = array1Value;
					intersection = temp;
				}
			}
			
		}
		
		//remove intersection form union
		for (int i = 0; i < union.length; i++) {
			
			int valueInUnion = union[i];
			
			boolean match = false;
			for (int j = 0; j < intersection.length; j++) {
				int valueInIntersection = intersection[j];
				if (valueInUnion == valueInIntersection) {
					match = true;
					break;
				}
			}
			
			if (!match) {
				result.add(valueInUnion);
			}
			
		}
		
		return result;
		
	}
	

	
	public static void main(String[] args) {
		
		int[] array1 = {5, 9, 4, 7, 4};
		int[] array2 = {1, 8, 7, 9, 11, 5};
		System.out.println("symmetric difference: " + diff(array1, array2));
	}
}
