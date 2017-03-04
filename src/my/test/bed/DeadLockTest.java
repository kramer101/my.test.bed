package my.test.bed;

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
	
	
	public static void main(String[] args) {
		
		
		Runnable r1 = () -> {
			System.out.println("Starting :" + Thread.currentThread().getName());
			deadlock1();
			deadlock2();
			
		
		};
		
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
		
		//ExecutorService exec = Executors.newSingleThreadExecutor();
		//exec.submit(t1);
		//exec.submit(t2);
		//exec.shutdown();
	}
}
