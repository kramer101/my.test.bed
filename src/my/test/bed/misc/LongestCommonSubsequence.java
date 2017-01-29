package my.test.bed.misc;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LongestCommonSubsequence {

	
	public static void main(String[] args) {
		//System.out.println(findLcs("ABAZDC", "BACBAD"));
		System.out.println(findLcs("ABCBDAB", "BDCABA"));
	}
	
	
	private static String findLcs(final String input1, final String input2) {
		String result = "";
		
		int[][] matrix = new int[input1.length() + 1][input2.length() + 1];
		
		List<Character> resultList = new LinkedList<Character>();
		
		for (int x = 0; x <= input1.length(); x++) {
			
			for (int y = 0; y <= input2.length(); y++) {
				
				if (y == 0 || x == 0) {
					
					matrix[x][y] = 0;

				} else if (input1.charAt(x - 1) == input2.charAt(y - 1)) {
		
					int previous = matrix[x - 1][y - 1];
					matrix[x][y] = previous + 1;
					
					resultList.add(input1.charAt(x - 1));
					
				} else {
					int previousX = matrix[x - 1][y];
					int previousY = matrix[x][y - 1];
					
					matrix[x][y] = Math.max(previousY, previousX);
				
				}
			}
		}
	
		for (int i = 0; i < matrix.length; i++) {
			String row = "";
			for (int j = 0; j < matrix[i].length; j++) {
				row = row + " " + matrix[i][j];
			}
			
			System.out.println("[" + row + "]");
		}
				
		Collections.reverse(resultList);
		Set<Character> resultAsSet = new LinkedHashSet<Character>(resultList);
		return resultAsSet.toString();
	}
	
}
