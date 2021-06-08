package gradledemo.howtodoinjava.java8.ReadFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args){
        Path filePath = Paths.get("c:/temp", "data.txt");
        System.out.println(filePath);

        try (Stream<String> lines = Files.lines(filePath,StandardCharsets.UTF_8)){
            lines.filter(s -> s.startsWith("1")).
                    forEach(System.out::println);
        }catch (IOException e) {}

    }
}
