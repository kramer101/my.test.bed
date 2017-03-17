package my.test.bed.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
		
		int a = 1;
		int b = 2;
		int c = a = b;
		System.out.println(a);
		
		Stack<Integer> stackTest = new Stack<>();
		
		stackTest.push(1);
		stackTest.push(2);
		stackTest.push(3);
		stackTest.push(4);
		stackTest.push(0);
		
		System.out.println(stackTest.get(0));
		
		List<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.reverse(list);
		
		System.out.println(list.get(0));
		
		System.out.println( (5 % 10));
		
		(new D()).m();;
		
	}
	
	
	static interface A {
        default void m() { System.out.println("hello from A"); }
    }
	static interface B extends A {
        default void m() { System.out.println("hello from B"); }
    }
	static interface C extends A {}
	static class D implements B, C {}
}
