package my.test.bed.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayOfMultisets {

	
	private static void readList(final List<Set<Integer>> data) {
		if (data == null) {
			System.out.println("Data is null, exiting");
			return;
		}
		
		//key - number, value - occurrence
		Map<Integer, Integer> mostPopular = new HashMap<>();
		
		int maxValueMostFrequent = 0;
		int keyMostFrequent = 0;
		
		for (Set<Integer> multiset : data) { //number of multisets n
			
		
			
			for (Integer num : multiset) { //number of numbers in a multiset n * m
				
				if (!mostPopular.containsKey(num)) {
					mostPopular.put(num, 1);
				} else {
					Integer currentCount = mostPopular.get(num);
					mostPopular.put(num, currentCount + 1);

				}
			}
			
			
		}
		
		int maxValueMostPopular = 0;
		int maxKeyMostPopular = 0;
		
		for (Integer num : mostPopular.keySet()) { //n * m
			int count = mostPopular.get(num);
			if (count > maxValueMostPopular) {
				maxValueMostPopular = count;
				maxKeyMostPopular = num;
			}
		}
		
		System.out.println("Most popular number : " + maxKeyMostPopular);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		List<Set<Integer>> data = new ArrayList<>();
		
		Set<Integer> multiset1 = new HashSet<>();
		
		multiset1.add(20);
		multiset1.add(9);
		multiset1.add(3);
		data.add(multiset1);
		
		Set<Integer> multiset2 = new HashSet<>();
		multiset2.add(10);
		multiset2.add(8);
		multiset2.add(4);
		multiset2.add(30);

		data.add(multiset2);
		
		Set<Integer> multiset3 = new HashSet<>();
		multiset3.add(1);
		multiset3.add(88);
		multiset3.add(2);
		multiset3.add(20);
	
		data.add(multiset3);
		
		readList(data);
		
		
	}
	
}
