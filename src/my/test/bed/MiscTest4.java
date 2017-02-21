package my.test.bed;

import java.util.LinkedList;
import java.util.List;

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
		
	}
}
