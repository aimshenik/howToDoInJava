package org.imshenik.howtodoinjava.Java8.IterateOverDirectory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) throws IOException {
        String home = System.getenv("HOME");
        String baseDir = home + "\\TESTS";

        List<File> files = Files.list(Paths.get(baseDir))
                .map(Path::toFile)
                .collect(Collectors.toList());

        files.forEach(System.out::println);
    }
}
