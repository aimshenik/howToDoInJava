package org.imshenik.sandbox;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class D {
    public static void main(String[] args) throws IOException {
        String s = "qwertyuiop";
        byte[] b1 = s.getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream is = new ByteArrayInputStream(b1);
        byte[] b2 = new byte[50];
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        int data = 0;
        while (true) {
            data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        System.out.println(os.toString());
        System.out.println(Arrays.toString(os.toByteArray()));

        FileOutputStream fos = new FileOutputStream(new File("C:\\Source\\2.txt"), true);
        ByteArrayInputStream is2 = new ByteArrayInputStream(b1);
        while (true) {
            data = is2.read();
            if (data == -1) break;
            fos.write(data);
        }

    }
}
