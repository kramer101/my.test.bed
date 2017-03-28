package my.test.bed.misc;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 * Created by vyakovlev on 3/28/17.
 */
public class NavigableSetTest  {


    public static void main(String[] args) {


        NavigableSet<Integer> mySet = new TreeSet<>();
        IntStream.range(0, 100).forEach(i -> mySet.add(i));

        System.out.println(mySet.higher(50));


        NavigableSetTest test = new NavigableSetTest();
        Thread.currentThread()
                .setUncaughtExceptionHandler((t, e) ->
                        System.out.println("Thread " + t + " exited ubruptly with error " + e));
        test.test();
    }

    public void test() {

        throw new RuntimeException("Testing");
    }


}

