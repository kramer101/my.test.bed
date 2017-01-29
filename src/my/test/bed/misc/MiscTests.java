package my.test.bed.misc;

import java.util.Arrays;

public class MiscTests {

	
	public static boolean scoresIncreasing(int[] scores) {
		  
		  if (scores != null) {
		    
		    for (int i = 1; i < scores.length; i++) {
		      if (scores[i] < scores[i-1]) {
		         return false;
		      }
		    }
		    
		  }
		  
		  return true;
		}
	
	
	public static void main(String[] args) {
		System.out.println(scoresIncreasing(new int[]{1,3,4}));
	
		int[] nums = new int[]{5,3,4,2,7,2,9,145,38,2,886,4,5,2,1};
		Arrays.sort(nums);

		Arrays.asList(new Integer[]{});
		System.out.println(Arrays.toString(nums));
	}
}
