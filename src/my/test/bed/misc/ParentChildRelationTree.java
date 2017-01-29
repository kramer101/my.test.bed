package my.test.bed.misc;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Provide implementation to the following problem: 
 * “Given a list of people, each person has an ID, 
 * given an array of arrays describing relations parent­>child ([12, 243] 
 * meaning that person with id=12 is parent of person with id=243). 
 * Find the longest family tree based on an input list of people and their relations.”
 * @author vyakovlev
 *
 */
public class ParentChildRelationTree {
	
	
	
	public static void main(String[] args) {
		Map<Integer, Integer[]> relationshipMap = new HashMap<Integer, Integer[]>();
		
		
		
		relationshipMap.put(1, new Integer[]{6});
		relationshipMap.put(2, new Integer[]{ 7 });
		relationshipMap.put(3, new Integer[]{ 8 });
		relationshipMap.put(4, new Integer[]{ 9 });
		relationshipMap.put(5, new Integer[]{ 10 });
		relationshipMap.put(6, new Integer[]{ 12, 15 });
		relationshipMap.put(7, new Integer[]{ 13 });
		relationshipMap.put(12, new Integer[]{ 14 });
		
		Set<Integer> longestPath = new LinkedHashSet<Integer>();
		
		for (Integer parent : relationshipMap.keySet()) {
			Integer[] children = relationshipMap.get(parent);
			
			for (Integer child : children) {
				if (relationshipMap.containsKey(child)) {
					longestPath.add(child);
				}
			}
			
			
		}
		
		
		System.out.println(longestPath);
			
	}

}
