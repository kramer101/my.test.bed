package my.test.bed;

import java.time.Clock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by vyakovlev on 3/17/17.
 */
public class WaitSleepThreadTest {
    Object o = new Object();

    void test1()  {
        synchronized (o) {
            System.out.println("waiting..." + Clock.systemDefaultZone().instant());
            try {
                int i = 0;
                while (i == 0) {
                    System.out.println("i==0" + (i == 0));
                    o.wait();
                    i++;
                }
                System.out.println("i :" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("Done waiting" + Clock.systemDefaultZone().instant());
        }
    }


    void test2()  {

        synchronized (o) {
            System.out.println("Sleeping..." + Clock.systemDefaultZone().instant());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Done sleeping" + Clock.systemDefaultZone().instant());
        }

    }


    public static void main(String[] args) throws InterruptedException {

        WaitSleepThreadTest instance = new WaitSleepThreadTest();

       /* Thread t1 = new Thread(() -> instance.test1());
        t1.start();*/

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> instance.test1());
        executorService.shutdown();

        System.out.println("Waiting before notify..." + Clock.systemDefaultZone().instant());
        Thread.sleep(1000);
        synchronized (instance.o) {

            instance.o.notifyAll();
            System.out.println("Notified." + Clock.systemDefaultZone().instant());

        }


    }

}
