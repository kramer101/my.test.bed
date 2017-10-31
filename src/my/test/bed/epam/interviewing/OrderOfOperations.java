package my.test.bed.epam.interviewing;

public class OrderOfOperations {

    public static void main(String[] args) {
        int a = 10;
        int b = (a +=20) + 1;

        int c = a + b;


        System.out.println(--c);

    }
}
