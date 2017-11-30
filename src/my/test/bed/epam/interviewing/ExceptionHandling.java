package my.test.bed.epam.interviewing;

public class ExceptionHandling {


    public static void main(String[] args) {
        try {
            callMe();
        } catch (IllegalArgumentException throwable) {
            System.out.println("IllegalArgumentException");
            throwable.printStackTrace();
        }
    }

    private static void callMe() throws UnsupportedOperationException, IllegalArgumentException {

        throw new RuntimeException("IllegalArgumentException");

    }

}
