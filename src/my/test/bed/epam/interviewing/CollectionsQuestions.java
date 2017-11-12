package my.test.bed.epam.interviewing;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 */
public class CollectionsQuestions {



    //given the code, what will be printed
    public static void queueVsStack() {

        Queue<String> collection1 = new PriorityQueue<>();
        collection1.add("banana");
        collection1.add("orange");
        collection1.add("apple");

        //what will be printed
        System.out.println(collection1.iterator().next());

        Deque<String> collection2 = new ArrayDeque<>();
        collection2.addFirst("apple");
        collection2.addFirst("banana");
        collection2.addFirst("orange");

        //what will be printed
        System.out.println(collection2.iterator().next());

    }

    public static void modifyCollection() {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("not a number");

        //will this work?
        /*for (String value : arrayList) {
            if (value.equals("not a number")) {
                arrayList.remove(value);
            }
        }*/


        //remove the non-numeric values
        //modify each value so it reads twice - 1 -> 11, 2 -> 22 etc

        ListIterator<String> iterator = arrayList.listIterator();



        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("not a number")) {
                iterator.remove();
            }

        }

        ListIterator<String> iterator2 = arrayList.listIterator();
        while (iterator2.hasNext()) {
            String value = iterator2.next();
            iterator2.set(value +  "" + value);

        }

        arrayList =
                arrayList.stream().map(s -> s + s).collect(Collectors.toList());

        arrayList.listIterator().forEachRemaining(System.out::println);
    }





    public static void main(String[] args) {
        modifyCollection();
        queueVsStack();
    }
}
