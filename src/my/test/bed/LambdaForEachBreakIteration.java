package my.test.bed;

import com.google.common.collect.Lists;

import java.util.List;

public class LambdaForEachBreakIteration {


    public static void main(String[] args) {
        List<String>  list = Lists.newArrayList("A", "B", "C", "D");


        list.forEach(s -> {
            System.out.println(s);
            if (s.equals("C")) {
                return;
            }
        });
    }
}
