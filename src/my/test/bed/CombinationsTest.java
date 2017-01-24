package my.test.bed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationsTest {

	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.out.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}

	public static void main(String[] args) {
		//permutation("", "ABAAB");
		
		String word = "ZXCASDQWE";
		
		List<Character> charSet = new ArrayList<Character>();
		for (char c : word.toCharArray()) {
			charSet.add(c);
		}
		Collections.sort(charSet);
		Collections.reverse( charSet );
		
		boolean isFirtsAndSecindAdjacent = false;
		
		int firstIndex = 0;
		int secondIndex;
		for (int i = 0; i < charSet.size() ; i++) {
		
			char thisChar = charSet.get(i);
			char nextChar = charSet.get(+1);
			if (word.charAt(0) ==  thisChar && word.charAt(1) ==  nextChar
					|| word.charAt(1) ==  thisChar && word.charAt(0) ==  nextChar) {
				isFirtsAndSecindAdjacent = true;
				break;
			}
				
		}

		System.out.println(isFirtsAndSecindAdjacent); 
		
		//charSet.descendingSet()
		System.out.println(charSet);
		
	}
}
