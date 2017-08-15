package my.test.bed;

public class MyHelper {

	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			String row = "";
			for (int j = 0; j < matrix[i].length; j++) {
				row = row + " " + matrix[i][j];
			}
			
			System.out.println(matrix[i] + "[" + row + "]");
		}
	}


	public static void printCharMatrix(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			String row = "";
			for (int j = 0; j < matrix[i].length; j++) {
				row = row + " " + matrix[i][j];
			}

			System.out.println("[" + row + "]");
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
