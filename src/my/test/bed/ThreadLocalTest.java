package my.test.bed;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.IntStream.range;

public class ThreadLocalTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		/*Thread t1 = new Thread(new MyTask());
		Thread t2 = new Thread(new MyTask());
		
		t1.start();
		Thread.sleep(3000);
		t2.start();*/


        Thread t1 = new Thread(new IntThread());
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(e.getMessage());
            }
        });
        Thread t2 = new Thread(new IntThread());

        t1.start();
        Thread.sleep(3000);
        t2.start();



    }
	
	
	private static class DateSingleton {
		
		
		private static final ThreadLocal<Date> threadDate = ThreadLocal.withInitial(() -> {
            Date d = new Date();
            System.out.println("initiating Date for thread " + Thread.currentThread().getName() + ", value=" + d);
            return d;
        });
		
		
		public static Date getDate() {
			return threadDate.get();
		}
		
		public static void removeDate() {
			System.out.println("Removing date variable for thread " + Thread.currentThread().getName());
			threadDate.remove();
		}
	}


	private static class IntSingleton {

        private static AtomicInteger integer = new AtomicInteger();

	    private static ThreadLocal<Integer> objectThreadLocal = new ThreadLocal<Integer>() {


            @Override
            protected Integer initialValue() {
                return integer.getAndIncrement();
            }
        };


	    public static Integer getInt() {
	        return objectThreadLocal.get();
        }

    }



    private static class IntThread implements Runnable {

        @Override
        public void run() {
            range(0, 10).forEach((i) -> {

                System.out.println(Thread.currentThread().getName()
                        + ": next int : " + IntSingleton.getInt());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
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
