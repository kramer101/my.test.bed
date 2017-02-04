package my.test.bed.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SymmetricDifferenceInArrays2 {

	
	
	private static Set<Integer> diff(List<Integer> a, List<Integer> b) {
		Set<Integer> result = new HashSet<>();
		result.addAll(a);
		result.addAll(b);
		
		Set<Integer> intersection = new HashSet<>();
		intersection.addAll(a);
		intersection.retainAll(b);
		
		result.removeAll(intersection);
		
		return result;
		
		
	}
	
	
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);//
		a.add(7);//
		a.add(9);
		
		List<Integer> b = new ArrayList<>();
		b.add(2);//
		b.add(7);//
		b.add(22);
		b.add(54);
		
		System.out.println(diff(a, b));
	}
}
