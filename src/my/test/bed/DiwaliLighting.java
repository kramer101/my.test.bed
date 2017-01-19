package my.test.bed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiwaliLighting {

	
	public static void main(String[] args) {
		String search = "B";
		
		List<String> basePattern = new LinkedList<String>();
		basePattern.add("B");
		basePattern.add("B");
		basePattern.add("R");
		basePattern.add("B");
		
		//System.out.println(11 % 4);
		
		List<Integer> searchIndex = new ArrayList<Integer>();
		for (int i = 0; i < basePattern.size(); i++) {
			String item = basePattern.get(i);
			
			if (search.equalsIgnoreCase(item)) {
				searchIndex.add(i+1);
			}
		}
		
		int start = 1;
		int end = 100;
		
		if (end < start) {
			throw new IllegalArgumentException("End cannot be less than start");
		}
		int count = 0;
		for (int i = start; i <= end; i++) {
			
			int indexToBase = i;
			if (indexToBase > basePattern.size()) {
				indexToBase = indexToBase % basePattern.size() + 1;
			}
			
			if (searchIndex.contains(indexToBase)) {
				count++;
			} 
		}
		
		System.out.println("Count of \"" + search + "\": " + count);
		
		
	}
}
