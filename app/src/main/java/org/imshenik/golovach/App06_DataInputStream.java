package org.imshenik.golovach;

import java.io.*;


//Reader Writer - потоки char-ов.
public class App06_DataInputStream {
    public static void main(String[] args) throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(new File("1.txt")));
        inputStream.close();
        double d = inputStream.readDouble();
        System.out.println(d);
    }
}
