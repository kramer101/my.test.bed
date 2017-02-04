package my.test.bed.misc;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
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
	
	private static List<Integer> result = new LinkedList<Integer>(); 
	
	public static void inOrder(final Map<Integer, Integer[]> map, int node) {
		if (!map.containsKey(node)) {
			result.add(node);
			System.out.println(node);
			return;
		}
		
		Integer[] children = map.get(node);
		if (children != null && children.length > 0) {
			inOrder(map, children[0]); //left child
			
			result.add(node);
			System.out.println(node); //root
			
			if (children.length == 2) {
				inOrder(map, map.get(node)[1]); //right child
			}
			
		}
		
		
	}
	
	public static void postOrder(final Map<Integer, Integer[]> map, int node) {

		if (!map.containsKey(node)) { //checking if a child is also a parent
			result.add(node);
			System.out.println(node);
			return;
		}
		
		Integer[] children = map.get(node);
		if (children != null) {
			
			for (int i = 0; i < children.length; i++) { //children left to right
				Integer child = children[i];
				postOrder(map, child);
				
			}
		}
		
		
		result.add(node);//root
		System.out.println(node);
	}
	
	
	public static void breadthFirst(final Map<Integer, Integer[]> map, int node) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(node);
		
		while (!queue.isEmpty()) {
			Integer current = queue.poll();
			result.add(current);
			System.out.println(current);
			
			Integer[] children = map.get(current);
			if (children != null) {
				for (Integer i : children) {
					queue.add(i);
				}
			}
		}
	}
	
	
	private static boolean isChildOf(Map<Integer, Integer[]> map, Integer child, Integer parent) {
		if (map.get(parent) != null) {
			
			Integer[] children = map.get(parent);
			for (Integer i : children) {
				if (child == i) {
					return true;
				}
			}
			return false;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer[]> relationshipMap = new HashMap<Integer, Integer[]>();
		
		int root = 100;
		relationshipMap.put(root, new Integer[]{6});
		relationshipMap.put(6, new Integer[]{ 12, 15 });
		relationshipMap.put(12, new Integer[]{ 14, 19 });
		relationshipMap.put(15, new Integer[]{ 20 });
		relationshipMap.put(20, new Integer[]{ 30 });
		relationshipMap.put(30, new Integer[]{ 40, 50 });
		
		System.out.println("postOrder:");
		result.clear();
		postOrder(relationshipMap, root);
		System.out.println(result);
		
		System.out.println("");
		
		System.out.println("inOrder:");
		result.clear();
		inOrder(relationshipMap, root);
		System.out.println(result);
		
		System.out.println("bfs:");
		
		//to find a longest path:
		//perform breadth first search, construct a linear representation of the tree based on the breadth first search
		//the last item should be the farthest node from the root node (first item).
		//After that, trace back starting with the last item and construct the longest path:
		//if the previous item is parent of the current item, put both in the longest path Set
		//otherwise continue looking for the item's parent backwards until found.
		result.clear();
		breadthFirst(relationshipMap, root);
		System.out.println(result);
		
		System.out.println("");
		
		Set<Integer> longestRoute = new LinkedHashSet<Integer>();
		int i = result.size() - 1;
		for (; i > 0; i--) {
			int increment = 1;
			
			while (!isChildOf(relationshipMap, result.get(i), result.get(i - increment))) {
				increment++;
			}
			longestRoute.add(result.get(i));
			longestRoute.add(result.get(i - increment));
			i = (i - increment) + 1;
		}
		
		System.out.println("Longest route " + longestRoute);
	}

}
