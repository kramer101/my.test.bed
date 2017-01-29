package my.test.bed.misc.codebat;

/**
 * 
 * Given two arrays of ints sorted in increasing order, outer and inner, 
 * return true if all of the numbers in inner appear in outer. 
 * The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true


 * @author vyakovlev
 *
 */
public class LinearIn {

	public boolean linearIn(int[] outer, int[] inner) {

		int matchingCount = 0;
		int j = 0;
		
		//for each inner loop item check if it exists in the outer loop.
		
		for (int i = 0; i < inner.length; i++) {
			int currentInner = inner[i];

			//since we know that the arrays are sorted in ascending order, we 
			//don't need to start iteration of the outer loop from [0] every time, because the numbers in both arrays increase
			//so for each inner item, we pick up form where we left since the last iteration 
			//(thus the "j" variable is initialized outside the "i" loop)
			for (; j < outer.length; j++) {
				int currentOuter = outer[j];
				if (currentInner == currentOuter) {
					matchingCount++;
					break;
				}
			}
		}

		if (inner.length == matchingCount) {
			return true;
		} else {
			return false;
		}
	}
}
