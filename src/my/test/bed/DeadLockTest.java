package my.test.bed;

import java.util.OptionalInt;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class DeadLockTest {

	private static Object o1 = new Object();
	private static Object o2 = new Object();
	
	
	public static void deadlock1() {
		synchronized (o1) {
			System.out.println(Thread.currentThread().getName() +  " - Executing deadlock on o1");
			
			synchronized (o2) {
				System.out.println(Thread.currentThread().getName() +  " - Executing deadlock on o2");
			}
		}
	}
	
	public static void deadlock2() {
		synchronized (o2) {
			System.out.println(Thread.currentThread().getName() +  " - Executing deadlock on o2");
			
			synchronized (o1) {
				System.out.println(Thread.currentThread().getName() +  " - Executing deadlock on o1");
			}
		}
	}

	
	public static void deadlock3() {
		synchronized (o1) {
			System.out.println(Thread.currentThread().getName() +  " - Executing deadlock on o1");
			
			synchronized (o2) {
				System.out.println(Thread.currentThread().getName() +  " - Executing deadlock on o2");
			}
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		Callable<Integer> r1 = () -> {
			
			OptionalInt result = IntStream.range(0, 5) .reduce((a, b) -> {
				System.out.println("Running + " + b + " :" + Thread.currentThread().getName());
				deadlock1();
				deadlock3();
				try {
					System.out.println(Thread.currentThread().getName() +  " is waiting...");
					Thread.sleep(5000);
				} catch (Exception e) {
					
					e.printStackTrace();
					//throw e;
				}
				return b + 1;
				
			});
			
	/*		for (int i = 0; i < 5; i++) {
				System.out.println("Running + " + i + " :" + Thread.currentThread().getName());
				deadlock1();
				deadlock3();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					throw e;
				}
			}
			*/
			return result.getAsInt();
		
		};
		
		
		
		//Thread t1 = new Thread(r1);
		//Thread t2 = new Thread(r1);
		
		//t1.start();
		//t2.start();
		
		
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<Integer> f1 =  exec.submit(r1);
		Future<Integer> f2 = exec.submit(r1);
		
		/*f1.get();
		
		f2.get();*/
		exec.shutdown();
		System.out.println("Shutdown called");
		exec.awaitTermination(20, TimeUnit.SECONDS);
		System.out.println("Waiting for completion...");
		
		System.out.println("f1=" + f1.get() + " f2=" + f2.get());
		
		
		
		
		
	}
}
