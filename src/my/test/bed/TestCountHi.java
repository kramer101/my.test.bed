package my.test.bed;

public class TestCountHi {

	
	private static int result;
	private static int position = 0;
	
	private static String search = "hi";
	
	private static int count(String input) {
		
		
		int indexOfSearch = input.indexOf(search);
		
		if (indexOfSearch == -1) {
			return result;
		}
		
		result++;

		
		String substr = input.substring(indexOfSearch, input.length()); 
		return count(substr);
		
		//return result;
	}
	
	
	public static void main(String[] args) {
		String s = "xxhixxhi";
		
		Child c = new Child();
		//Parent p =  (Parent) c;
		
		
	}
	
	
	private static class Parent {
		String a = "parent";
		
		void print() {
			System.out.println("parent");
		}
		
		static void print2() {
			System.out.println("parent");
		}
		
	}
	
	private static class Child {
		String a = "child";
		
		void print() {
			System.out.println("child");
		}
		
		static void print2() {
			System.out.println("child");
		}
		
	}
	
	
}
