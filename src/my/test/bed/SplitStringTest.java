package my.test.bed;

import java.util.ArrayList;
import java.util.List;

public class SplitStringTest {

	private static final List<String> DICT = new ArrayList<String>();
	
	static {
		DICT.add("hello"); 
		DICT.add("world");
		DICT.add("my");
		DICT.add("name"); 
		DICT.add("is"); 
		DICT.add("jake");
		DICT.add("more");
		DICT.add("words");
		DICT.add("in");
		DICT.add("dictionary");
	}
	
	private static String splitString(String input) {
		List<String> result = new ArrayList<String>();
		
		
		for(int i = 0; i < input.length(); i++) {
			String part = input.substring(0, i);
			if (DICT.contains(part)) {
				result.add(part);
				result.add(" ");
				
			}
		}
		
		
		return result.toString();
	}
	
	
	
	public static void main(String[] args) {
		
		String input = "helloworldmynameisjake";
		
		System.out.println(splitString(input));
	}
}
