package my.test.bed;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * http://www.javamagazine.mozaicreader.com/JulyAug2017/twitter#&pageSet=48&page=0
 */
public class MiscQuiz {

    public static void main(String[] args) {

        try {



            Path path1 = Paths.get("c:/work");
            WatchService watchService = path1.getFileSystem().newWatchService();
            path1.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);

            while (true) {
               WatchKey watchKey =
                       watchService.poll(10, TimeUnit.SECONDS);
               if (watchKey != null) {
                   watchKey.pollEvents().forEach(watchEventParam -> {
                       System.out.println(watchEventParam.kind()  + ":" + watchEventParam.context());
                   });
               } else {
                   System.out.println("no changes in " + path1);
               }
            }



        } catch (Exception eParam) {
            eParam.printStackTrace();
        }
    }


    int c = 0;
    public void test1() {


        {
            int i = 0;
            c = i;
            long b = i;

        }

        for (int i = 0; i < 10; i++) {

        }

        {

            int i = 9;
        }

    }

    class Record{}
    class LongRecord extends  Record{}

    public void test2() {
        List<LongRecord> l1 = getRecords();
        processRecords(l1);
        l1.add(new LongRecord());
    }

    void processRecords(Collection<? extends Record> list) {

    }

    List<LongRecord> getRecords() {
        return null;
    }

}
