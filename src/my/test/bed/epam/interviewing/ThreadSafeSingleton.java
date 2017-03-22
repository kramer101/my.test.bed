package my.test.bed.epam.interviewing;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Created by vyakovlev on 3/20/17.
 */
public class ThreadSafeSingleton {

    private ThreadSafeSingleton() {

    }

    public static void main(String[] args) {


        IntStream.range(0, 10).forEach(i -> new Thread(new MyTask()).start());



    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            int value = //Service2.get();
            Service.instance.get();
            System.out.println(Thread.currentThread().getName() + " value " + value);
        }
    }


    static enum Service {
        instance;

        static AtomicInteger state = new AtomicInteger(0);
        int get() {

            return state.getAndIncrement();

        }
    }


    static class Service2 {
        private Service2(){};

        private static int state;

        static int get() {

            return state++;
        }


    }
}
