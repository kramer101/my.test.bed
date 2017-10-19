package my.test.bed.epam.interviewing;

/**
 *
 */
public class Autoboxing {

    public static void main(String[] args) {

        int i1 = 10;
        Integer integer1 = new Integer(i1);
        Integer integer2 = i1;
        Integer integer3 = 10;

        System.out.println(i1 == integer1);
        System.out.println(integer2 == integer3);


    }


}
