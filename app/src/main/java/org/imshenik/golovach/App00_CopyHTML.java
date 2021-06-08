package org.imshenik.golovach;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class App00_CopyHTML {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://ya.ru");
        InputStream inputStream = url.openStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream,byteArrayOutputStream);
        byte[] rawData = byteArrayOutputStream.toByteArray();
        String html = new String(rawData, StandardCharsets.UTF_8);
        System.out.println(html);

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
