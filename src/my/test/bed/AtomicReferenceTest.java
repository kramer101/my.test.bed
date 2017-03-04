package my.test.bed;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class AtomicReferenceTest {

	
	public static void main(String[] args) {
		
		String initValue = "int value";
		AtomicReference<String> atomicStr = new AtomicReference<String>(initValue);
		
		Runnable r1 = () -> {
			System.out.println(atomicStr);
			IntStream.range(0, 10).forEach((i) -> {
				
				atomicStr.set(initValue + " " + i);
				System.out.println(Thread.currentThread().getName() +  " >> " + atomicStr.get());
			});
			
			
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
		

		
		Comparator<B> c2 = new Comparator<B>() {

			@Override
			public int compare(B o1Param, B o2Param) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
	}
	
	private static class A implements Comparable<A>{

		@Override
		public int compareTo(A oParam) {
			return oParam.compareTo(this);
			
		}}
	
	private static class B{}
	
}
