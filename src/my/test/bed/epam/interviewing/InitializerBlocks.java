package my.test.bed.epam.interviewing;

/**
 * What will be printed if we execute this class?
 */
public class InitializerBlocks {

    {
        System.out.println("One");
    }

    static {
        System.out.println("Two");
        test();
    }

    private static void test() {
        System.out.println("Three");
    }

    public static void main(String[] args) {

    }
}
