package my.test.bed.misc;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.TimeUnit;

public class MiscTest12 {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (getNumber() < 50);
        System.out.println("Done");

        i = 0;
        while (getNumber() < 50) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Done");


        int retries = 5;
        boolean isError = false;
        do {

            System.out.println("Executing");
            try {

                execute();
                isError = false;
            } catch (Exception e) {

                if (!isError) {
                    isError = true;
                }
                retries--;

                System.out.println("Going to retry. Waiting...");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e1) {
                    System.err.println(e1.getMessage());
                }
                if (retries == 0) {
                    e.printStackTrace();
                    throw new RuntimeException("Retries failed");
                }
            }

        } while (isError && retries > 0);

        System.out.println("DONE");
    }


    private static int exceptionCount = 0;
    private static void execute() throws Exception {

        exceptionCount++;

        if (exceptionCount < 2) {
            throw new Exception("service returned error");
        }




    }

    private static int getNumber() {

        int number =  RandomUtils.nextInt(0, 100);
        //System.out.println("number - " + number);

        return number;
    }
}
