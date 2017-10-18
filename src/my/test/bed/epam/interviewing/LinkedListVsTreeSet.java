package my.test.bed.epam.interviewing;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedListVsTreeSet {

    public static void main(String[] args) {
        List<String> linkedList = Lists.newLinkedList();
        linkedList.add("N");
        linkedList.add("B");
        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("10");
        String linkedListValue = linkedList
                .stream()
                .collect(Collectors.joining(","));
        //linkedList.iterator().forEachRemaining(System.out::print);
        System.out.println(linkedListValue);
        System.out.println(linkedList);

        System.out.println();

        Set<String> treeSet = Sets.newTreeSet();
        treeSet.add("N");
        treeSet.add("B");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("10");
        String treeSetValue = treeSet
                .stream()
                .collect(Collectors.joining(","));
        //treeSet.iterator().forEachRemaining(System.out::print);
        System.out.println(treeSetValue);
        System.out.println(treeSet);
    }
}
