package org.imshenik.golovach;

import java.io.*;


//Reader Writer - потоки char-ов.
public class App06_DataOutputStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(new File("1.txt"))); //8000 byte in 2.txt
        for (int i = 0; i < 1000; i++) {
            outputStream.writeDouble(123.333);
        }
        outputStream.flush();
        outputStream.close();
    }
}
