package my.test.bed;

import java.util.ArrayList;
import java.util.List;

public class MiscTest2 {

	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 3;
		List<Integer> list = new ArrayList<>();
		
		test(y, x, list);
		y = x + 1;
		System.out.println("x" + x + " y" + y);
		System.out.println(list);
		System.out.println(Math.PI * Math.pow(5, 2));
	}
	
	
	private static void test(int x, int y, List<Integer> list) {
		
		x++;
		System.out.println("x" + x + " y" + y);
		list.add(55);
		list = new ArrayList<>();
		System.out.println(list);
		
		
	}
}
