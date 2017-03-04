package my.test.bed;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MiscTest6 {
	
	
	public static void main(String[] args) {
		MyTestClass t = new MyTestClass();
		t.test();
		
		System.out.println(numberNeeded("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
		
		//System.out.println(numberNeeded("aabbcc", "ddeeffaa"));
	}
	
	
	public static int numberNeeded(String a, String b) {
	      
		
        List<Character> listA = new ArrayList<>();
        for (char c : a.toCharArray()) {
            listA.add(c);
        }
        int deltaA = a.length() - listA.size();
        
        List<Character> listB = new ArrayList<>();
        for (char c : b.toCharArray()) {
            listB.add(c);
        }
        
        int deltaB = b.length() - listB.size();
        
        listA.retainAll(listB);
        System.out.println(listA);
        
        Set<Character> intersection = new HashSet<>(listA);
        int intersectionCount = intersection.size();
        
        
        int countToRemove = getCountForString(a, intersection) + getCountForString(b, intersection);
        return countToRemove;
    }
	
	private static int getCountForString(String str, Set<Character> intersection) {
		int countToRemove = 0;
		
		StringBuilder sb = new StringBuilder();
		
		Set<Character> visited = new HashSet<>();
		for (char c : str.toCharArray()) {
        	
        	if (!intersection.contains(c)) {
        		countToRemove++;
        		sb.append(c);
        		
        	} else {
        		if (visited.contains(c)) {
        			countToRemove++;
        			
        			sb.append(c);
        		}
        	}
        	visited.add(c);
        	
        }
		
		return sb.capacity();
	}
	
	
	private static interface IOne {
		default void test() {
			System.out.println("IOne test");
		}
		
	
	}
	
	private static interface ITwo {
		default void test() {
			System.out.println("ITwo test");
		}
		
		
	}

	
	private static class MyTestClass implements IOne, ITwo {

		@Override
		public void test() {
			
			IOne.super.test();
			ITwo.super.test();
		}

		
	}
	
	
}


