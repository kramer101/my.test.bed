package my.test.bed.epam.interviewing;

public class ExceptionHandling {


    public static void main(String[] args) {
        try {
            callMe();
            System.out.println("done");

        } catch (IllegalArgumentException exception) {
            System.out.println("Caught IllegalArgumentException");
            exception.printStackTrace();
        }
    }

    private static void callMe() throws UnsupportedOperationException, IllegalArgumentException {

        throw new RuntimeException("IllegalArgumentException");

    }

}
