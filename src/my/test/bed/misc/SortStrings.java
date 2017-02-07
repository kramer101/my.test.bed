package my.test.bed.misc;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

public class SortStrings {

	
	private static String[] sort(final String[] words) {
		
		String[] result = words;
		
		for (int i = 0; i < result.length; i++) {
		
			int lowestIndex = 0;
			
			for (int j = i + 1; j < result.length; j++) {
				if (result[j].compareTo(result[lowestIndex]) < 0) {
					lowestIndex = j;
				}
			}
			
			String firstElementValue = result[i];
			result[i] = result[lowestIndex];
			result[lowestIndex] = firstElementValue;
			
		}
		
		return result;
		
	}
	
	
	
	
	
	private static class IgnoreCaseStringComparator implements Comparator<String>  {

		@Override
		public int compare(String o1, String o2) {
			return o1.toLowerCase().compareTo(o2.toLowerCase());
		}
		
		
	}
	
	public static void main(String[] args) {
		String[] words = {"Fred", "bob", "Tom", "Mark", "john", "Steve"};
		
		System.out.println(Arrays.toString(sort(words)));
		Arrays.sort(words, new IgnoreCaseStringComparator());
		System.out.println(Arrays.toString(words));
		
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR, 12);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.AM_PM, Calendar.AM);
		c.add(Calendar.MINUTE, 1500);
		
		System.out.println(c);
		
		
	}
}
