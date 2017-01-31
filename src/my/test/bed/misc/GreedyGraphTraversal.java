package my.test.bed.misc;

/**
 * 
 * 
 * Given a matrix of n*n size, each cell contains a number. 
 * Find the maximum sum of elements on the way from top­left to bottom­right. 
 * You can move either to the right cell, or to the below cell. (Greedy algorithms)


 * @author vyakovlev
 *
 */
public class GreedyGraphTraversal {


	public static int readInts(int[][] matrix, int x, int y, int currentMax) {
		
		int current = matrix[x][y];
		
		//base case
		if (x == matrix.length - 1 && y == matrix.length - 1) {
			System.out.println("x" + x + ", y" + y + " current=" + current);
			
			return Math.max(current, currentMax);
		}
		
		
		System.out.println("x" + x + ", y" + y + " current=" + current);
		x = x + 1; //move right and read next
		int next = matrix[x][y];
		System.out.println("x" + x + ", y" + y + " next" + next);
		
		int maxLocal = Math.max(current, next);
		
		y = y + 1; //move down before the recursion call
		//recursion. at this point, the x is already moved to the right by one and the y is moved down by one
		//so on the next call will be for the next node.
		return readInts(matrix, x, y, Math.max(maxLocal, currentMax));
		
	}
	
	
	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		matrix[0][0] = 1;
		matrix[1][0] = 500;
		matrix[1][1] = 8;
		matrix[2][1] = 9;
		matrix[5][5] = 109;
		
		System.out.println("Max value : " + readInts(matrix, 0, 0, 0));
	}
}
