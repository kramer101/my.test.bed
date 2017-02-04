package my.test.bed.misc;

public class TestMyHashMap {

	
	public static void main(String[] args) {
		MyHashMap<String, String> myMap = new MyHashMap<>();
		
		System.out.println("size="  + myMap.size());
		myMap.put("One", "1");
		myMap.put("Two", "2");
		myMap.put("Three", "3");
		myMap.put("Fourty Seven", "47");
		myMap.put("Five Hundred Fourty Seven", "547");
		myMap.put("Aa", "Aa");
		myMap.put("BB", "BB");
		myMap.put("One", "Another 1");
		
		System.out.println("size="  + myMap.size());
		
		System.out.println(myMap.get("One"));
		
		MyHashMap<Integer, Integer> myMap2 = new MyHashMap<>();
		
		myMap2.put(1, 111);
		myMap2.put(2, 222);
		System.out.println(myMap2.get(2));
		System.out.println(myMap.get("Three"));
		
		myMap.remove("Three");
		System.out.println(myMap.get("Three"));
		System.out.println("size="  + myMap.size());
		myMap.put("Three", "3");
		System.out.println(myMap.get("Three"));
		System.out.println("size="  + myMap.size());
	}
}
