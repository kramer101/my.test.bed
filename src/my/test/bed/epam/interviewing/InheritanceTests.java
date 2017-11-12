package my.test.bed.epam.interviewing;

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
}
