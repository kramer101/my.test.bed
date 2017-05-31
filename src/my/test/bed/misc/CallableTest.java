package my.test.bed.misc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * Created by Vadym_Yakovlev on 5/25/2017.
 */
public class CallableTest {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> futureTask = executor.submit(() -> {

            for (int i = 0; i < 10; i++) {
                System.out.println("Working " + i + " ...");
                Thread.sleep(1000);
            }

            return "";
        });

        executor.shutdown();

        try {



            System.out.println("Invoking...");
            futureTask.get(5, TimeUnit.SECONDS);
            System.out.println("Done");

        } catch (Exception eParam) {
            eParam.printStackTrace();
            futureTask.cancel(true);
        } finally {
            executor.shutdown();
        }
    }
}
