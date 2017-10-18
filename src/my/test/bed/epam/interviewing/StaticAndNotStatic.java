package my.test.bed.epam.interviewing;

/**
 * Does the code below compile? Explain your answer.
 */
public class StaticAndNotStatic {

    private static int x;
    private int y;

    public void test() {
        x = 10;
        System.out.println(x);
    }


    public static void anotherTest() {

        //y = 10;
        //System.out.println(y);

    }
}
