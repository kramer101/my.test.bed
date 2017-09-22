package my.test.bed.misc;


import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class ArrayIntersection {

    private String name;



    public int[] getIntersection(int a[], int[] b) {

        int[] result = new int[0];


        for (int element1 : a) {

            for (int element2 : b) {
                if (element1 == element2) {

                    int newLength = result.length + 1;
                    int[] temp = new int[newLength];
                    for (int i2 = 0; i2 < result.length; i2++) {

                        temp[i2] = result[i2];
                    }
                    temp[newLength - 1] = element1;
                    result = temp;
                    break;

                }
            }
        }

        return result;

    }


    @Test
    public void testIntersection() {

        int a[] = {4,22,387,56,86,45,2};
        int b[] = {987,836,45,2,13};

        int[] result = getIntersection(a, b);

        Assert.assertTrue(result.length == 2);
        Assert.assertTrue(contains(result, 45));
        Assert.assertTrue(contains(result, 2));


    }

    private boolean contains(final int a[], final int i) {
        for (int element: a) {
            if (element == i) return  true;
        }
        return false;
    }



    private class B {

        void test() {
            name = "Larry";

        }
    }

}
