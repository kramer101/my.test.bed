package my.test.bed;

import java.util.ArrayList;
import java.util.Collection;

public class MiscTest10 {


    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();


        collection.add("One");
        collection.add("Two");
        collection.add("Three");

        collection.remove("One");

        System.out.println(collection);


        Collection<Vehicle> col2 = new ArrayList<>();


        col2.add(new Car());
        col2.add(new SpaceShuttle());

        int a = 0x1F;
        System.out.println(a);

        int $___$___b = 0;
        System.out.println($___$___b);

        CharSequence value1 = "a";
        value1 = "";


        long l = System.currentTimeMillis();

        Appliance.DISHWASHER.run();


        int x = 1;
        int y = 20;

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);


        float f = 2.5F;
        double d = 2.5;
        int z = 128 >>> 3;

        System.out.println(z);
    }


    private void test() throws  Throwable {
        throw new RuntimeException();
    }


    static interface Drivable {
        void drive();
    }

    static interface Parkable {
        void park();
    }


    static class Vehicle implements Drivable {


        @Override
        public void drive() {

        }


    }

    static class Car extends Vehicle implements Parkable {

        @Override
        public void drive() {

        }

        @Override
        public void park() {

        }
    }

    static class SpaceShuttle extends Vehicle  implements Flyable {

        @Override
        public void drive() {

        }

        @Override
        public void fly() {

        }
    }

    static interface Flyable {
        void fly();
    }


    public enum Appliance {


        DISHWASHER {
            @Override
            public void run() {

            }
        },

        DRYER {
            @Override
            public void run() {

            }
        };

        public abstract void run();

    }

}

