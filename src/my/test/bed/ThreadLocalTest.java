package my.test.bed;

import java.util.Date;

public class ThreadLocalTest {

	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new MyTask());
		Thread t2 = new Thread(new MyTask());
		
		t1.start();
		t2.start();
		
		
	}
	
	
	private static class DateSingleton {
		
		
		private static final ThreadLocal<Date> threadDate = new ThreadLocal<Date>() {

			@Override
			protected Date initialValue() {
				Date d = new Date();
				System.out.println("initiating Date for thread " + Thread.currentThread().getName() + ", value=" + d);
				return d;
			};
			
		};
		
		
		public static Date getDate() {
			return threadDate.get();
		}
		
		public static void removeDate() {
			System.out.println("Removing date variable for thread " + Thread.currentThread().getName());
			threadDate.remove();
		}
	}
	
	
	private static class MyTask implements Runnable {

		@Override
		public void run() {
			
			try {
				Date d = DateSingleton.getDate();
				
				for (int i = 0; i < 5; i++) {
				
					System.out.println(Thread.currentThread().getName() + " - date:" + d + ", waiting...");
					Thread.sleep(3000);
				}
			} catch (Exception e) {

				e.printStackTrace();
			} finally {
				DateSingleton.removeDate();
			}
			
		}
		
	}
}
