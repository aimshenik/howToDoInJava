package org.imshenik.howtodoinjava.io;

// taken from https://howtodoinjava.com/java/io/how-to-create-a-new-file-in-java/

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson1_check_if_file_exist {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\aimshenik\\Downloads\\pravila.pdf");
        boolean doesFileExist = Files.exists(path,LinkOption.NOFOLLOW_LINKS);
        System.out.println( doesFileExist);
    }


}
