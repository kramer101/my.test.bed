package my.test.bed.misc;

public class BitwiseTest {

	
	public static void main(String[] args) {
		
		int a = 60;
		int b = 10;
		
		System.out.println(toBinary(b));
		
		System.out.println(Math.max(-1, -1));
		
		
	}
	
	private static String toBinary(int decimal) {
		return Integer.toString(decimal, 2);
	}
}
