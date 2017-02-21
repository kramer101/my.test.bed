package my.test.bed.misc;

import java.util.Arrays;

public class CoinChangeProblem {

	
	
	private static int getCount(int[] coinArray, int target) {
		int count = 0;
		int[] arrayToTarget = new int[target + 1];
		
		Arrays.sort(coinArray);

		int[][] matrix = new int[coinArray.length][arrayToTarget.length];
		
		for (int coinIndex = 0; coinIndex < coinArray.length; coinIndex++) {
			
			int coinValue = coinArray[coinIndex];
			
			for (int numIndex = 0; numIndex < arrayToTarget.length; numIndex++) {
				
				
				matrix[coinIndex][numIndex] = getValue(coinIndex, numIndex, coinValue, matrix);
			}
			
		}
		
		
		for (int i = 0; i < matrix.length; i++) {
			String row = "";
			for (int j = 0; j < matrix[i].length; j++) {
				row = row + " " + matrix[i][j];
			}
			
			System.out.println(coinArray[i] + "[" + row + "]");
		}
		
		count = matrix[coinArray.length - 1][arrayToTarget.length - 1];
		return count;
	}
	
	private static int getValue(int coinIndex, int numIndex, int coinValue, int[][] matrix) {
		int value = 1;
		//int value = numIndex;
		if (coinValue > numIndex) {
			if (coinIndex > 0) {
				value = matrix[coinIndex - 1][numIndex];
			}
			
		} else {
		//else if (coinValue < num) {
			if (coinIndex > 0 && (numIndex - coinValue) >= 0) {
				value = matrix[coinIndex - 1][numIndex] + matrix[coinIndex][numIndex - coinValue];
				//value = Math.min(matrix[coinIndex - 1][numIndex], (matrix[coinIndex][numIndex - coinValue] + 1));
			}
			
		}
		
		return value;
				
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{2, 5, 3, 6};
		System.out.println(getCount(array, 10));
		
		
		/*int[] array = new int[]{1, 2, 3};
		System.out.println(getCount(array, 4));*/
		
	}
}
