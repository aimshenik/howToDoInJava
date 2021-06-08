package org.imshenik.howtodoinjava.io;

// taken from https://howtodoinjava.com/java/io/how-to-create-a-new-file-in-java/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class Lesson1_create_a_new_or_append_an_existing {
    public static void main(String[] args) throws IOException {

        List<String> lines = Arrays.asList("1st line", "2nd line");
        Files.write(Paths.get("file6.txt"), lines, StandardCharsets.UTF_8);

    }


}
