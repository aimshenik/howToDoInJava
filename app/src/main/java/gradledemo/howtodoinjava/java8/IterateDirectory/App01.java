package gradledemo.howtodoinjava.java8.IterateDirectory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App01 {
    public static void main(String[] args){
        String home = System.getenv("HOME");
        Path homeDir = Path.of(home);
//
//        try {
//            List<File> files = Files.list(Paths.get(home))
//                    .filter(file -> Files.isRegularFile(file))
//                    .map(Path::toFile)
//                    .collect(Collectors.toList());
//            files.forEach(System.out::println);
//        } catch (IOException r){
//
//        }

        try {
            Path java = Path.of(homeDir.toString() + "\\.ssh");
            Files.list(Paths.get(java.toString())).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
