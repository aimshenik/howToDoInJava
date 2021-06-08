package gradledemo.howtodoinjava.java8.WriteToFile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args){
        Path path = Paths.get("c:/output.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write("HELKJRWL:EKJR:WLKERJ_____________________");
        }catch (IOException e){}
    }
}
