package org.imshenik.golovach;

import java.io.*;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


//Reader Writer - потоки char-ов.
public class App09_UsageMyDecorator {
    public static void main(String[] args) throws IOException {
        DataOutputStream outputStream = new DataOutputStream(
                new GZIPOutputStream (
                        new App09_MyDecorator(
                                new BufferedOutputStream(
                                        new FileOutputStream(
                                                new File("2.txt"))))
                )
        ); //61 byte in 2.txt
        for (int i = 0; i < 1000; i++) {
            outputStream.writeDouble(123.456);
        }
        outputStream.flush();
        outputStream.close();

        DataInputStream inputStream = new DataInputStream(new GZIPInputStream(new BufferedInputStream( new FileInputStream(new File("2.txt")))));
        double[] readData = new double[1000];
        for (int i = 0; i < 1000; i++) {
            readData[i] = inputStream.readDouble();
        }
        System.out.println(Arrays.toString(readData));
    }
}
