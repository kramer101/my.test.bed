package my.test.bed;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;

public class MiscTest5 {

	
	
	public static void main(String[] args) {
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("***Shutdown hook executed, terminating...");
				
			}
		}));
		
		Runtime.getRuntime().traceMethodCalls(true);
		System.out.println("executing...");
	        
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("available memory:"  + Runtime.getRuntime().totalMemory() / 1000 / 1000 + "MB");
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory() / 1000 / 1000 + "MB");
		
		System.getProperties().forEach((key, value) ->System.out.println(key + "=" + value));
		
		System.out.println("****ENV:*****");
		
		System.getenv().forEach((k, v) -> System.out.println(k + "=" + v));
			
		
		String s1 = "testEntityToPojo";
		System.out.println(Arrays.toString(s1.getBytes()));
		Long l1 = new Long(Arrays.toString(s1.getBytes()).replace("[", "").replaceAll("]", "").replace(",", "").replace(" ", ""));
		System.out.println(l1);
		
		//C c1 = (C) new B();
		Z z1 = new C();
		C c2 = (C) getC();
		
		A a1 = getA();
		A a2 = getB();
		A a3 = (A) new C();
		
		Z c3 =  (A) getAnotherA();
		
	
		
		
		byte byte1 = 1;
		byte byte2 = 2;
		
		byte1 += byte2;
		
		double n1 = 0.1 * 3;
		System.out.println(n1);
		
		BigDecimal bs1 = new BigDecimal(21.21);
		System.out.println(bs1.pow(10, new MathContext(0)));
		
		float f1 = 1.2230F;
		
		System.out.println(f1);
	}
	
	private static A getA() {
		return new A();
	}
	
	private static B getB() {
		return new B();
	}
	
	private static Z getC() {
		return new C();
	}
	
	private static Z getAnotherA() {
		return new A();
	}
	
	
	private static AA getAByInterface() {
		return new A();
	}
	
	private static class A implements Z, AA {}
	private static class B extends A implements BB{}
	private static class C extends B implements CC {}
	
	private static interface Z {}
	
	private static interface AA {}
	private static interface BB {}
	private static interface CC {}
}

