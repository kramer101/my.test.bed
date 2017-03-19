package my.test.bed;

import java.nio.ByteBuffer;

/**
 * Created by vyakovlev on 3/18/17.
 */
public class MiscTest8 {

    public static void main(String[] args) {
        int i = 0;




        System.out.println(++i);


        ByteBuffer bb = ByteBuffer.allocate(Long.BYTES);
        bb.put(new byte[]{1,2,3,4,5});
        bb.flip();
        System.out.println(bb.getLong());
    }
}
