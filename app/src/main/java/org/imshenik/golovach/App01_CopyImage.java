package org.imshenik.golovach;

import java.io.*;
import java.net.URL;

public class App01_CopyImage {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://archive.zbrushcentral.com/attachment.php?attachmentid=562577");
        InputStream inputStream = url.openStream();
        OutputStream file = new FileOutputStream(new File("C:\\users\\aimshenik\\1.jpg"));
        copy(inputStream,file);


    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        int data;
        while (true) {
            data = src.read();
            if (data == -1) break;
            dst.write(data);
        }
    }
}
