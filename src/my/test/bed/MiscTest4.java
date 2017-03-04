package my.test.bed;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class MiscTest4 {

	private int value = 100;
	
	public int getValue() {
		return this.value  - 10;
	}
	
	
	public static void main(String[] args) {
		
		String str = "abba";
		List<String> pairs = new LinkedList<>();
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i + 1; j < str.length(); j++) {
				System.out.println(str.charAt(i) + "(" + i + "), " +  str.charAt(j) + "(" + j + ")");
				pairs.add(str.charAt(i) + "" +  str.charAt(j));
				
			}
		}
		
		System.out.println(pairs);
		
		String test = "B";
		System.out.println(test.equals(test.toUpperCase()));
		
		System.out.println("Test".substring(0, 4));
		
		MiscTest4 t = new MiscTest4();
		System.out.println(t.getValue());
		System.out.println(t.getValue());
		
		
		List<Integer> l2 = new LinkedList<>();
		
		l2.add(43);
		l2.add(3);
		l2.add(8);
		l2.add(19);
		l2.add(22);
		l2.add(1);
		
		Collections.sort(l2);
		
		System.out.println(l2);
		
		int size = 50;
		
		int j = 0;
		j++;
		System.out.println(j);
		++j;
		System.out.println(j);
		j += 1;
		System.out.println(j);
		
		int[][] m = new int[5][10];
		
		System.out.println(m.length);
		
		int a = 11;
		int b = 22;
		MyInt i = new MyInt(333);
		System.out.println(a + " " + b + " " + i);
		test1(a, b, i);
		
		System.out.println(a + " " + b + " " + i.i);
		System.out.println(a + " " + b + " " + i);
		
		int[] array = new int[10]; 
		AtomicInteger sum = new AtomicInteger(0);
		
		IntStream.range(0, 10).forEach((intValue) -> {
			//sum.set(sum.get() + intValue);
			//array[intValue] = intValue;	
			System.out.println("intValue=" + intValue);
			int v = sum.accumulateAndGet(intValue, (currentResult, incrementedValue) -> {
					System.out.println("currentResult=" + currentResult);
					System.out.println("incrementedValue=" + incrementedValue);
					return currentResult + incrementedValue;
				});
			
		});
		
		
		
		System.out.println(Arrays.toString(array));
		System.out.println(sum);
		
		
		
		AtomicReference<Integer> intref = new AtomicReference<>();
		intref.set(3);
		System.out.println(intref.get());
	}
	
	private static class MyInt {
		MyInt(int iParam) {
			i = iParam;
		}
		int i;
	}
	
	
	private static void test1(int a, int b, MyInt i) {
		a = 111;
		b = 222;
		i.i = 444;
		System.out.println(">>" + i);
		i = new MyInt(555);
		System.out.println(">>" + i);
	}
}
