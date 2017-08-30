package my.test.bed.misc;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorTest {

    public static void main(String[] args) {

        long a = (int) (Math.random() * 10);
        System.out.println(a);
        double d = 880.5D;
        int i = (int) d;

        System.out.println(i);

        try {
            Files.walkFileTree(Paths.get("c:/work"), new SimpleFileVisitor<Path>() {

                @Override
                public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs) throws IOException {
                    System.out.println("FILE:" + file);
                    return super.visitFile(file, attrs);
                }


                @Override
                public FileVisitResult postVisitDirectory(final Path dir, final IOException exc) throws IOException {
                    System.out.println("POST:" + dir);
                    return super.postVisitDirectory(dir, exc);
                }

                /*@Override
                public FileVisitResult preVisitDirectory(final Path dir, final BasicFileAttributes attrs) throws IOException {
                    System.out.println("PRE:" + dir);
                    return super.preVisitDirectory(dir, attrs);
                }*/
            });



        } catch (IOException eParam) {
            eParam.printStackTrace();
        }
    }
}
