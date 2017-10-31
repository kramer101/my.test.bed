package my.test.bed.reactive;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureTests {




    public static void main(String[] args) throws InterruptedException {

        List<String> allResults = new ArrayList<>();

        CompletableFuture<Void> voidCompletableFuture =
                CompletableFuture.supplyAsync(CompletableFutureTests::serviceThree)
                .thenAcceptAsync(System.out::println);

        CompletableFuture<Void> voidCompletableFuture1 =
                CompletableFuture.supplyAsync(CompletableFutureTests::serviceTwo)
                .thenAcceptAsync(System.out::println);

        CompletableFuture<Void> voidCompletableFuture2 =
                CompletableFuture.supplyAsync(CompletableFutureTests::serviceOne)
                .thenAcceptAsync(System.out::println);

        CompletableFuture<Void> allOf =
                CompletableFuture.allOf(
                        voidCompletableFuture, voidCompletableFuture1, voidCompletableFuture2);



        try {
            allOf.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Thread.currentThread().join();


    }


    private static String serviceOne() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "service one " + LocalTime.now();
    }

    private static String serviceTwo() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "service two " + LocalTime.now();
    }

    private static String serviceThree() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "service three " + LocalTime.now();
    }
}
