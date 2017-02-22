package my.test.bed;

import java.util.LinkedList;
import java.util.List;

public class LambdaTest1 {

	public static  void doTest(MyTestFuctionalInterface execution) {
		int i = 1;
		int j = 2;
		execution.apply(i, j);
	}
	
	
	public static void test2(int... arg) {
		
	}
	
	
	public static void sessionDelegate(final SessionExecution exec) {
		
		Session s = null;
		try {
			s = SessionFactory.getSession();
			exec.execute(s);
		} finally {
			SessionFactory.releaseSession(s);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		doTest((a, b)-> System.out.println(a + b));
		doTest((a, b)-> System.out.println(a - b));
		
		test2(1, 2, 4);
		test2();
		
		sessionDelegate((session) -> {
			Object obj = session.getObject("123");
			System.out.println(obj);
		});
		
		
		List<String> l1 = new LinkedList<>();
		l1.add("One");
		l1.add("Two");
		l1.add("Three");
		l1.add("Four");
		l1.add("Five");
		l1.add("Six");
		
		l1.stream()
		.filter((s) -> s.length() <= 3)
		.map((s) -> s.toUpperCase())
		.forEach((s) -> System.out.println(s));
	
		int lengthTotal = l1.stream()
		.mapToInt((s) -> s.length())
		.reduce(0, (i, j) -> i + j);
		
		System.out.println(lengthTotal);
		
	}
	
	@FunctionalInterface
	public interface MyTestFuctionalInterface {
		
		void apply(int a, int b);
	}
	
	
	@FunctionalInterface
	public interface SessionExecution {
		void execute(final Session s);
	}
	
	public static class Session {
		public Object getObject(String id) {
			return "Doc " + id;
		}
	}
	
	public static class SessionFactory {
		public static Session getSession() {
			return new Session();
		}
		
		public static void releaseSession(final Session s) {
			System.out.println("*session released*");
		}
	
	}
}
