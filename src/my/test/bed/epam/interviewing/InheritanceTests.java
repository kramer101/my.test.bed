package my.test.bed.epam.interviewing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * To test understanding of inheritance and assignment compatibility.
 */
public class InheritanceTests {







    //DO NOT USE
    /*public static void main(String[] args) {
        CompositeVehicle myVehicle = new MyVehicle("test");

        myVehicle.drive();
        myVehicle.sail();
        myVehicle.stop();
    }


    private interface Car {
        default void drive() {
            System.out.println("drives");
        }
    }

    private interface Boat {
        default void sail() {
            System.out.println("sails");
        }
    }


    private interface CompositeVehicle extends Car, Boat {

        default void stop() {
            System.out.println("stopping...");
        }

        String getName();

    }

    private static class MyVehicle implements CompositeVehicle {


        private final String name;

        public MyVehicle(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }*/


    public static void main(String[] args) {
        Service s = new MyService();
        s.run();
    }

    private  interface Service {



        default Logger getLogger() {
            return LoggerFactory.getLogger(this.getClass());
        }

        default String getName() {
            return this.getClass().getName();
        }


        void run();
    }


    private static class MyService implements Service {

        @Override
        public void run() {

            System.out.println("my service running " + getName());
            getLogger().debug("test");
        }
    }
}
