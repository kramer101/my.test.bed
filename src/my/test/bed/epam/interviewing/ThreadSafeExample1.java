package my.test.bed.epam.interviewing;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ThreadSafeExample1 {

    private static AtomicInteger number = new AtomicInteger(0);

    private static long number1;

    public static int get() {
        return number.getAndIncrement();
    }


    public static long get1() {
        return number1++;
    }



    public static void main(String[] args) {

        //ThreadSafeExample1 example1 = new ThreadSafeExample1();

        /*System.out.println(example1.getAndIncrement());
        System.out.println(example1.getAndIncrement());
        System.out.println(example1.getAndIncrement());
        System.out.println(example1.getAndIncrement());*/

        IntStream.range(0, 10).forEach(value ->
                new Thread(new Worker(), "thread " + value).start());

    }



    private static class Worker implements Runnable {
        @Override
        public void run() {
            long value = ThreadSafeExample1.get1();
            System.out.println("thread " + Thread.currentThread().getName() + " " + value);

        }
    }

}
