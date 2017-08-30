package my.test.bed;

import java.util.Collection;
import java.util.PriorityQueue;

public class ThreadWithDelayTest {

    public static void main(String[] args) {

        int[] x = {0};
        boolean[] hold = {true};

        P p = new P(2);
        P s = new S(2,2);


        new Thread(() -> {
            delay();
            x[0] = 99;
            hold[0] = false;

        }).start();

        new Thread(() -> {
            delay();
            while (hold[0])
                ;
            System.out.println(x[0]);

        }).start();
        //99

        String s1 = "a simple test";//"a ".concat("simple ").concat("test");
        System.out.println(s1);
        String s2 = "a simple test";
        System.out.println(s1 == s2);

        String[] stringArray1 = {"a", "b", "c"};
        String s3 = "a";
        System.out.println(stringArray1[0] == s3);

    }


    static void delay() {
        try {
            Thread.sleep((int) (Math.random() * 10));
        } catch (InterruptedException eParam) {
        }
    }


    interface ParentIF{}
    interface ChildIF extends ParentIF{}
    interface OtherIF{}
    class ParentCL{}
    class ChildCL extends ParentCL{}
    class OtherCL {}


    private void test() {
        ChildIF cI = null;
        ParentIF pI = null;
        OtherIF oI = null;
        ChildCL cC = null;
        ParentCL pC = null;
        OtherCL oC = null;

        /*
        cI = (ChildIF) oI;
        cC = (ChildCL) pC;

        cC = (ChildCL) oC;

        cI = (ChildIF) oC;
        */


        //an is-a relationship
        Collection<String> a = new PriorityQueue<>();


        //assignment on the right is a parent of target
        cC = (ChildCL) pC;


    }


    class A extends  Object {}


    static class P {
        private int value;
        public P(int v) {
            value = v;
        }


    }

    static class S extends P {
        private int value;

        public S (int v, int u) {
            super(v);
            value = u;
            System.out.println(value + super.value);
        }
    }

}
