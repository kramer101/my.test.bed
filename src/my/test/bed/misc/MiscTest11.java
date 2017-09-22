package my.test.bed.misc;

import java.math.BigInteger;

public class MiscTest11 {

    static Integer a;
    private static int i = 10;

    public static void main(String[] args) {



        String s1 = "Hello my name is Bob.";

        byte[] bytes = s1.getBytes();
        BigInteger stringAsInt = new BigInteger(bytes);

        System.out.println(stringAsInt.toString(36));


        long l = 99L;
        System.out.println(Long.toUnsignedString(l, 36));

        int left = 22000;
        int right = 233;

        if (left > right) {
            right = left + right;
            left = right - left;
            right = right - left;
        }
        System.out.println(left);
        System.out.println(right);

        int a = 10;
        int b = (a +=20) + 1;

        int c = a + b;
        --c;
        System.out.println(c);

        System.out.printf("Value: %b", Math.E);

        Thread thread1 = new Thread(new TestRun(), "t1");
        Thread thread2 = new Thread(new TestRun(), "t2");
        Thread thread3 = new Thread(new TestRun(), "t3");

        System.out.println();

        thread1.start();

        try {
            thread1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();

        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("we're done here");

        Vehicle v = new Car();
        //Bike b = (Bike) v;

        System.out.println(v.getClass().getName());
        System.out.println(v.getClass().getTypeName());

        System.out.println(v.getClass().getName());
        System.out.println(v.getClass().getName());
    }


    static class TestRun implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }


    static class Vehicle {
        public void printSound() {
            System.out.print("vehicle");
        }
    }

    static class Car extends Vehicle {
        public void printSound() {
            System.out.print("car");
        }
    }

    static class Bike extends Vehicle  {
        public void printSound() {
            System.out.print("bike");
        }
    }

    public MiscTest11() {
       int z = this.i;
    }

    static void test(int a, int b) {
        int c = a/b;
    }


    static class MyTestClass1 {

        public MyTestClass1(int a) {

        }

    }


}
