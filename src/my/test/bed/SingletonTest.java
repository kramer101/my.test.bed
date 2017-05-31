package my.test.bed;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Created by vyakovlev on 3/18/17.
 */
public class SingletonTest {


    public static void main(String[] args) {


        IntStream.range(0, 10).forEach(i -> new Thread(new Task()).start());


int     q = 0x00ff;

    }


    private static class Task implements Runnable {

        @Override
        public void run() {
            Service.instance.test();
        }
    }

    static enum Service {
        instance;


        //int state = 0;
        private AtomicInteger state = new AtomicInteger();
        void test() {
            System.out.println("testEntityToPojo " + state.getAndIncrement());

        }
    }

}
