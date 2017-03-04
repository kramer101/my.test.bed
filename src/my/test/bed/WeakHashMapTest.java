package my.test.bed;

import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class WeakHashMapTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap<AtomicInteger, AtomicReference<String>> m1 = new WeakHashMap<>();
		AtomicInteger k1 = new AtomicInteger(0);
		AtomicReference<String> v1 = new AtomicReference<String>("zero");
		
		m1.put(k1, v1);
		
		while(m1.size() != 0) {
			System.out.println("size:" + m1.size());
			
			Thread.sleep(5000);
			k1 = null;
			System.gc();
		}
		
		System.out.println("Weak reference key/value removed. size=0");
		
	}
}
