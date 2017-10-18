package my.test.bed.misc;

import java.util.*;

/**
 * @author vyakovlev
 *
 */
public class ShuffleTest {

	private static Random random = new Random();
	
	public Collection<Integer> shuffle(final Integer[] array) {
		
		Stack<Integer> result = new Stack<>();
		if (array == null || array.length == 0) {
			return result;
		}


		LinkedList<Integer> listOfInts = new LinkedList<>(Arrays.asList(array));
		
		while (listOfInts.size() > 0) {
			if (listOfInts.size() == 1) {
				result.add(listOfInts.pop());
				break;
			}
			
			int randomIndex = getRandomIndex(listOfInts.size());
			int lastItem = listOfInts.removeLast();
			
			if (randomIndex != listOfInts.size()) { //replace the item at random position with the last value
				int itemAtRandom = listOfInts.get(randomIndex);
				listOfInts.set(randomIndex, lastItem);
				result.add(itemAtRandom);
			} else {
				result.add(lastItem);
			}
				
		}
		
		return result;
	}
	
	private int getRandomIndex(final int upper) {
		return random.nextInt(upper);
	}
	
	public static void main(String[] args) {
		ShuffleTest shuffle = new ShuffleTest();
		for (int i = 0; i < 100; i++) {
			System.out.println(shuffle.shuffle(new Integer[]{1, 2, 3 , 4, 5 , 6, 7, 8}));	
		}
		
	}
	
	
	
}
