package my.test.bed;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Created by Vadym_Yakovlev on 6/6/2017.
 */
public class MiscTest9 {

    private static int int1;
    public static int getInt() {

        return int1++;
    }
    public static void main(String[] args) {



        System.out.println(getInt());
        System.out.println(getInt());

        URL system = ClassLoader.getSystemClassLoader().getResource(".");

        URL context = Thread.currentThread().getContextClassLoader().getResource(".");

        System.out.println(system);
        System.out.println(context);

        test();


        /*doAction(Test1::map, new Test1Impl());
        doAction(Test1::unMap, new Test1Impl());*/

        Test1 t1 = new Test1Impl();



        doAction(t1::map);




    }


    private static void action2() {

    }



    private static void doAction(BiConsumer<Object, Object> f) {
        String s = "X";
        Integer i = 11;
        f.accept(s, i);
    }

    private  interface Test1<A, B> {

        void unMap(A s1, B i1);
        void map(A s1, B i1);

    }

    private static class Test1Impl implements Test1<String, Integer> {

        @Override
        public void unMap(String s1, Integer i1) {
            System.out.println("Unmapping " + s1);
        }

        @Override
        public void map(String s1, Integer i1) {
            System.out.println("Mapping " + s1);
        }


    }

    private static void test() {

        try {

            Set<String> stringSet = new HashSet<>();

            stringSet.add("1");
            stringSet.add("2");
            stringSet.add("3");
            stringSet.add("4");


            for(String s : stringSet) {
                if (s.equals("3")) {
                    return;
                }
            }
            System.out.println("Hi");

        } finally {
            System.out.println("Hi in finally");
        }

    }


    private static void test2() {

        try {

            Set<String> stringSet = new HashSet<>();

            stringSet.add("1");
            stringSet.add("2");
            stringSet.add("3");
            stringSet.add("4");

            stringSet.forEach(sParam -> {
                if (sParam.equals("3")) {
                    return;
                }
            });


            System.out.println("Hi");

        } finally {
            System.out.println("Hi in finally");
        }

    }


}
