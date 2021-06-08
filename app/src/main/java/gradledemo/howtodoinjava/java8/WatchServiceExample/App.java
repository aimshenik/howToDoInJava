package gradledemo.howtodoinjava.java8.WatchServiceExample;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchService;

public class App {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get(".");
        System.out.println(path.toAbsolutePath());
        WatchService watchService = path.getFileSystem().newWatchService();
        path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
        

    }
}
