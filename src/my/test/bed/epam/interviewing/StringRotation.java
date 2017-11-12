package my.test.bed.epam.interviewing;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class StringRotation {



    public static boolean isRotation(final String string, String rotation) {
        return (string + string).contains(rotation);

    }


    public static boolean isRotation2(final String string, String rotation) {
        if (string.length() != rotation.length()) return false;
        if (string.equals(rotation)) return true;

        for (int i  = 1; i < string.length(); i++) {
            if (rotation.charAt(0) == string.charAt(i)) {
                String subString = string.substring(i, string.length())
                        + string.substring(0, i);
                return subString.equals(rotation);
            }
        }

        return false;
    }

    @Test
    public void testRotation() {
        Assert.assertTrue(isRotation("cab", "abc"));
        Assert.assertFalse(isRotation("abc", "cba"));
        Assert.assertFalse(isRotation("abc", "bcad"));

    }


    @Test
    public void testRotation2() {
        Assert.assertTrue(isRotation2("cab", "abc"));
        Assert.assertFalse(isRotation2("abc", "cba"));
        Assert.assertFalse(isRotation2("abc", "bcad"));

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();


        long start2 = System.currentTimeMillis();
    }
}
