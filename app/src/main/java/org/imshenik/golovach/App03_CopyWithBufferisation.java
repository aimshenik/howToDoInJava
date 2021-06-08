package org.imshenik.golovach;

import java.io.*;
import java.net.URL;

public class App03_CopyWithBufferisation {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://archive.zbrushcentral.com/attachment.php?attachmentid=562577");
        InputStream inputStream = url.openStream();
        OutputStream file = new FileOutputStream(new File("C:\\users\\aimshenik\\1.jpg"));
        long nanos = System.nanoTime();
        copy(inputStream,file);
        System.out.println("NANO DELTA IS : " + (System.nanoTime() - nanos)/1000_000);
        inputStream.close();

    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        byte[] buffer = new byte[1024];
        int count;
        while ((count=src.read(buffer))!=-1) {
            dst.write(buffer,0,count);
        }
    }
}
