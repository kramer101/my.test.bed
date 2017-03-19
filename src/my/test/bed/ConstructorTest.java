package my.test.bed;

/**
 * Created by vyakovlev on 3/18/17.
 */
public class ConstructorTest {


    public static void main(String[] args) {

        Parent child = new Child();
        System.out.println(child);

        Child.test();

        Parent p = null;

        p.test("parent");
    }



    static class FamilyMember implements Human {
        FamilyMember() {
            System.out.println("Family Member");
        }

        @Override
        public String toString() {
            return "this is a family member object";
        }

        static void test(String name) {
            System.out.println("test by family member object : " + name);
        }
    }

    static class GrandParent extends FamilyMember {

        GrandParent() {
            System.out.println("grand parent");
        }

        GrandParent(final String name) {
            System.out.println("grand parent:" + name);
        }

    }


    static class Parent extends GrandParent {
        Parent() {

            super("Frank");
            System.out.println("parent");
        }
    }

    static class Child extends Parent {
        Child() {
            super();
            System.out.println("child");

        }

        static void test() {
            System.out.println("test by child object");
        }

    }

    static interface Human {

        String toString();


    }



}
