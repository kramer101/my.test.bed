package my.test.bed.misc;

import java.util.Arrays;
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



    private static class StringComparator implements Comparator<String>  {

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }

    }
	
	public static void main(String[] args) {
		String[] words = {"Fred", "bob", "Tom", "Mark", "john", "Steve"};
		
		//System.out.println(Arrays.toString(sort(words)));
		Arrays.sort(words, new StringComparator());
		System.out.println(Arrays.toString(words));

	}
}
