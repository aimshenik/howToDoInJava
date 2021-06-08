package gradledemo.howtodoinjava.java8.WriteToFile;

import com.google.common.primitives.Bytes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) throws IOException{
        String content = "qweqweqweФ";
        Files.write(Paths.get("c:\\output.txt"), content.getBytes());
    }
}
