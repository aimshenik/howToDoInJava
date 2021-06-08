package org.imshenik.sandbox;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TutorPoint1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        FileOutputStream fileOutputStream = null;
        try{
            cin = new InputStreamReader(System.in);
            System.out.println("q to quit");
            char c;

            fileOutputStream = new FileOutputStream(new File("C:\\Source\\2.txt"), true);

            do {
                c = (char) cin.read();
                fileOutputStream.write(c);
            } while (c!='q');

        }finally {
            fileOutputStream.close();
            cin.close();
        }
    }
}
