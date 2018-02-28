package my.test.bed.epam.interviewing;

public class OrderOfOperations {

    public static void main(String[] args) {
        int a = 10;
        int b = (a +=20) + 1;

        int c = a + b;


        System.out.println(--c);

        d(c(b(a())));

    }


    private static A a() {
        System.out.println("a");
        return new A();
    }

    private static B b(A a) {
        System.out.println("b");
        return new B();
    }


    private static C c(B b) {
        System.out.println("c");
        return new C();
    }

    private static void d(C c) {
        System.out.println("d");
    }


    private static class A {}
    private static class B {}
    private static class C {}


}
